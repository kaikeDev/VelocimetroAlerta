package br.com.helpdev.velocimetroalerta.gps;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by guilherme on 17/07/16.
 */
public class ObVelocimentroAlerta implements Serializable {

    private Date dateInicio;
    private double vMedia;
    private double vAtual;
    private double vMaxima;
    private double distancia;
    private double distanciaPausada;
    private double altitudeAtual;
    private double precisaoAtual;
    private double ganhoAltitude;
    private double perdaAltitude;
    private double duracao;
    private long duracaoPausado;

    public ObVelocimentroAlerta() {
        this.dateInicio = new Date();
    }

    public long getDuracaoPausado() {
        return duracaoPausado;
    }

    public void setDuracaoPausado(long duracaoPausado) {
        this.duracaoPausado = duracaoPausado;
    }

    public void addDuracaoPausado(double duracaoPausado) {
        this.duracaoPausado += duracaoPausado;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDistanciaPausada() {
        return distanciaPausada;
    }

    public void setDistanciaPausada(double distanciaPausada) {
        this.distanciaPausada = distanciaPausada;
    }

    public void addDistanciaPausada(double distanciaPausada) {
        this.distanciaPausada += distanciaPausada;
    }

    public double getPerdaAltitude() {
        return perdaAltitude;
    }

    public void setPerdaAltitude(double perdaAltitude) {
        this.perdaAltitude = perdaAltitude;
    }

    public void addPerdaAltitude(double perdaAltitude) {
        this.perdaAltitude += perdaAltitude;
    }

    public Date getDateInicio() {
        return dateInicio;
    }

    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
    }

    public double getPrecisaoAtual() {
        return precisaoAtual;
    }

    public void setPrecisaoAtual(double precisaoAtual) {
        this.precisaoAtual = precisaoAtual;
    }

    public double getvMedia() {
        return vMedia;
    }

    public void setvMedia(double vMedia) {
        this.vMedia = vMedia;
    }

    public double getvAtual() {
        return vAtual;
    }

    public void setvAtual(double vAtual) {
        this.vAtual = vAtual;
    }

    public double getvMaxima() {
        return vMaxima;
    }

    public void setvMaxima(double vMaxima) {
        this.vMaxima = vMaxima;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void addDistancia(double distancia) {
        this.distancia += distancia;
    }

    public double getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(double altitudeAtual) {
        this.altitudeAtual = altitudeAtual;
    }

    public double getGanhoAltitude() {
        return ganhoAltitude;
    }

    public void setGanhoAltitude(double ganhoAltitude) {
        this.ganhoAltitude = ganhoAltitude;
    }

    public void addGanhoAltitude(double ganhoAltitude) {
        this.ganhoAltitude += ganhoAltitude;
    }

    @Override
    public String toString() {
        return "ObVelocimentroAlerta{" +
                "dateInicio=" + dateInicio +
                ", vMedia=" + vMedia +
                ", vAtual=" + vAtual +
                ", vMaxima=" + vMaxima +
                ", distancia=" + distancia +
                ", distanciaPausada=" + distanciaPausada +
                ", altitudeAtual=" + altitudeAtual +
                ", precisaoAtual=" + precisaoAtual +
                ", ganhoAltitude=" + ganhoAltitude +
                ", perdaAltitude=" + perdaAltitude +
                ", duracao=" + duracao +
                '}';
    }
}
