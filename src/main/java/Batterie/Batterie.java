package Batterie;

public class Batterie {

    private int[][][] energy = new int[100][10][100];
    private int loadedCells;
    private int overload;
    private int overloadTakeOut;
    private int percentageFullCell;
    private boolean isFull;
    private boolean isEmpty;

    public Batterie(){
        for(int i = 0; i <100; i++){
            for(int j = 0; j <10; j++){
                for(int k = 0; k <100; k++){
                    this.energy[i][j][k] = 1;
                    this.loadedCells++;
                }
            }
        }
    }

    public void chargeEnergy(int en){
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        int a;
        int b;
        int c;
        en = en - 1;
        this.loadedCells = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 100; k++) {
                    if (this.energy[i][j][k] == 1) {
                        this.loadedCells++;
                    }
                }
            }
        }
        int loadedCellsBeforeCharge = (int) loadedCells;

        for (int i = 99; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 99; k >= 0; k--) {
                    if (this.energy[i][j][k] == 0) {
                        i1 = i;
                        j1 = j;
                        k1 = k;
                        i = 0;
                        j = 0;
                        k = 0;
                    }
                    if (this.energy[0][0][0] == 1) {
                        break;
                    }
                }
            }
        }
        //int d = Integer.parseInt(en.substring(0, 5)) - 1;
        if (en <= -1) {
            System.out.println("Your cannot charge with an negative amount of energy!");
        }
        else if (en > 99999) {
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 100; k++) {
                        this.energy[i][j][k] = 1;
                    }
                }
            }
            this.loadedCells = 0;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 100; k++) {
                        if (this.energy[i][j][k] == 1) {
                            this.loadedCells++;
                        }
                    }
                }
            }
        } else {
            String g = String.valueOf(en);
            StringBuilder e = new StringBuilder();

            if (g.length() == 1) {
                e.append("0000");
            }
            if (g.length() == 2) {
                e.append("000");
            }
            if (g.length() == 3) {
                e.append("00");
            }
            if (g.length() == 4) {
                e.append("0");
            }
            e.append(g);

            int kHelper = Integer.parseInt(e.substring(3, 5));
            int jHelper = Integer.parseInt(e.substring(2, 3));
            int iHelper = Integer.parseInt(e.substring(0, 2));

            if (k1 - kHelper < 0) {
                jHelper++;
                if (k1 == 0) {
                    c = 100 - kHelper + 1;
                } else {
                    c = 100 - (kHelper + 1 - (k1 + 1));
                }
            } else {
                c = k1 - kHelper;
            }

            if (jHelper == 10) {
                iHelper++;
                jHelper = 0;
                b = j1 - jHelper;
            } else {
                if (j1 - jHelper < 0) {
                    iHelper++;
                    if (j1 == 0) {
                        b = 10 - jHelper;
                    } else {
                        b = 10 - (jHelper - j1);
                    }
                } else {
                    b = j1 - jHelper;
                }
            }

            if (i1 - iHelper < 0) {
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 100; k++) {
                            this.energy[i][j][k] = 1;
                        }
                    }
                }
                this.loadedCells = 0;
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 100; k++) {
                            if (this.energy[i][j][k] == 1) {
                                this.loadedCells++;
                            }
                        }
                    }
                }
            } else {
                a = i1 - iHelper;
                for (int i = i1; i >= a; i--) {
                    if (i == a) {
                        for (int j = j1; j >= b; j--) {
                            if (j == b) {
                                for (int k = 99; k >= c; k--) {
                                    this.energy[i][j][k] = 1;
                                }
                            } else {
                                for (int k = 99; k >= 0; k--) {
                                    this.energy[i][j][k] = 1;
                                }
                            }
                        }
                    } else {
                        for (int j = 9; j >= 0; j--) {
                            for (int k = 99; k >= 0; k--) {
                                this.energy[i][j][k] = 1;
                            }
                        }
                    }
                }
                this.loadedCells = 0;
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 100; k++) {
                            if (this.energy[i][j][k] == 1) {
                                this.loadedCells++;
                            }
                        }
                    }
                }
            }
        }
        if (this.energy[0][0][0] == 1) {
            System.out.println("loaded before"+loadedCellsBeforeCharge);
            this.overload = en + 1 - (100000 - loadedCellsBeforeCharge);
            this.isFull = true;
        } else {
            this.overload = 0;
        }
        this.percentageFullCell = this.loadedCells / 100000;
    }

    public void takeOut(int energy) {

        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        int a;
        int b;
        int c;
        energy = energy - 1;

        this.loadedCells = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 100; k++) {
                    if (this.energy[i][j][k] == 1) {
                        this.loadedCells++;
                    }
                }
            }
        }
        int LoadedCellsBeforeTakeOut = (int) this.loadedCells;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 100; k++) {
                    if (this.energy[i][j][k] == 1) {
                        i1 = i;
                        j1 = j;
                        k1 = k;
                        i = 99;
                        j = 9;
                        k = 99;
                    }
                    if (this.energy[9][9][99] == 0) {
                        break;
                    }
                }
            }
        }
        if (energy <= -1) {
            System.out.println("Your cannot take out a negative amount!");

        } else if (energy > 99999) {
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 100; k++) {
                        this.energy[i][j][k] = 0;
                    }
                }
            }
            this.loadedCells = 0;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 100; k++) {
                        if (this.energy[i][j][k] == 1) {
                            this.loadedCells++;
                        }
                    }
                }
            }
        } else {
            String g = String.valueOf(energy);
            StringBuilder e = new StringBuilder();

            if (g.length() == 1) {
                e.append("0000");
            }
            if (g.length() == 2) {
                e.append("000");
            }
            if (g.length() == 3) {
                e.append("00");
            }
            if (g.length() == 4) {
                e.append("0");
            }
            e.append(g);

            int kHelper = Integer.parseInt(e.substring(3, 5));
            int jHelper = Integer.parseInt(e.substring(2, 3));
            int iHelper = Integer.parseInt(e.substring(0, 2));

            if (k1 + kHelper > 99) {
                jHelper++;
                if (kHelper == 99) {
                    c = k1;
                } else {
                    c = kHelper + k1 - 100;
                }
            } else {
                if (kHelper == 99) {
                    jHelper++;
                    c = k1;
                } else {
                    c = k1 + kHelper;
                }
            }

            if (jHelper == 10) {
                iHelper++;
                jHelper = 0;
                b = j1;
            } else {
                if (j1 + jHelper > 9) {
                    iHelper++;
                    b = j1 + jHelper - 10;
                } else {
                    b = j1 + jHelper;
                }
            }

            if (i1 + iHelper > 99) {
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 100; k++) {
                            this.energy[i][j][k] = 0;
                        }
                    }
                }
                this.loadedCells = 0;
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 100; k++) {
                            if (this.energy[i][j][k] == 1) {
                                this.loadedCells++;
                            }
                        }
                    }
                }
            } else {
                a = i1 + iHelper;
                for (int i = i1; i <= a; i++) {
                    if (i == a) {
                        for (int j = 0; j <= b; j++) {
                            if (j == b) {
                                if (kHelper == 99) {
                                    for (int k = 0; k < c; k++) {
                                        this.energy[i][j][k] = 0;
                                    }
                                } else {
                                    for (int k = 0; k <= c; k++) {
                                        this.energy[i][j][k] = 0;
                                    }
                                }
                            } else {
                                for (int k = 0; k < 100; k++) {
                                    this.energy[i][j][k] = 0;
                                }
                            }
                        }
                    } else {
                        if (i == i1) {
                            for (int j = j1; j < 10; j++) {
                                if (j == j1) {
                                    for (int k = k1; k < 100; k++) {
                                        this.energy[i][j][k] = 0;
                                    }
                                } else {
                                    for (int k = 0; k < 100; k++) {
                                        this.energy[i][j][k] = 0;
                                    }
                                }
                            }
                        }
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 100; k++) {
                                this.energy[i][j][k] = 0;
                            }
                        }
                    }
                }
                this.loadedCells = 0;
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 100; k++) {
                            if (this.energy[i][j][k] == 1) {
                                this.loadedCells++;
                            }
                        }
                    }
                }
            }

        }
        if (this.energy[9][9][99] == 0) {
            this.overloadTakeOut = energy + 1 - LoadedCellsBeforeTakeOut;
            this.isEmpty = true;
        } else {
            this.overloadTakeOut = 0;
        }
        this.percentageFullCell = this.loadedCells / 100000;
    }

    public int getLoadedCells() {
        return loadedCells;
    }

    public int getOverload() {
        return overload;
    }

    public int getOverloadTakeOut() {
        return overloadTakeOut;
    }

    public int getPercentageFullCell() {
        return percentageFullCell;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
