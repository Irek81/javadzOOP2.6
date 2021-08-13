package ru.netology;

public class Radio {

    // радиостанции

    private int minChanel = 0;
    private int maxChanel = 9;
    private int currentChanel;

    public int getCurrentChanel () {
        return currentChanel;
    }

    public int getMinChanel () {
        return minChanel;
    }

    public int getMaxChanel () {
        return maxChanel;
    }

    public void setCurrentChanel (int setCurrentChanel) {
        if (currentChanel < minChanel) {
            return;
        }
        if (currentChanel > maxChanel) {
            return;
        }
        this.currentChanel = currentChanel;
    }

    public void setNextChanel() {
        if (currentChanel < maxChanel) {
            this.currentChanel = currentChanel + 1;
        } else {
            this.currentChanel = minChanel;
        }
    }

    public void setPrevChanel() {
        if (currentChanel > minChanel) {
            this.currentChanel = currentChanel - 1;
        } else {
            this.currentChanel = maxChanel;
        }
    }

    // громкость радио

    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentVolume () {
        return currentVolume;
    }

    public int getMinVolume () {
        return minVolume;
    }

    public int getMaxVolume () {
        return maxVolume;
    }

    public void setCurrentVolume (int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
    }

    public void setReduceVolume(int setReduceVolume) {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }



}
