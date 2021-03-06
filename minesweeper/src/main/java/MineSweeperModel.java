package minesweeper.src.main.java;

import javax.swing.Timer;

import minesweeper.src.main.java.components.Icons;

public class MineSweeperModel {
    private int rows;
    private int columns;
    private int mines;
    private Timer t;
    private Icons icons;

    public double pieceSizeModifier = 1.0;

    public MineSweeperModel() {
        rows = 16;
        columns = 16;
        mines = 40;
        icons = new Icons();
    }

    public MineSweeperModel(int index) {
        rows = 16;
        columns = 16;
        mines = 40;
        icons = new Icons(index);
    }


    public MineSweeperModel(int rows, int columns, int mines, int index) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        icons = new Icons(index);        
    }

    public MineSweeperModel(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        icons = new Icons();
    }

    public void startTimer()
    {
        t.start();
    }

    public void setTimer(Timer time) {
        t = time;
    }

    public int getRows(){ return rows;}
    public int getColumns(){ return columns; }
    public int getMines() { return mines; }
    public Icons getIcons() { return icons; }
    public double getSizeModifier() { return pieceSizeModifier; }
    public void setRows(int rows) { this.rows = rows; }
    public void setColumns(int columns) { this.columns = columns; }
    public void setMines(int mines) { this.mines = mines; }
    public void setIconsIndex(int icons) { this.icons.setSkinIndex(icons); }
}
