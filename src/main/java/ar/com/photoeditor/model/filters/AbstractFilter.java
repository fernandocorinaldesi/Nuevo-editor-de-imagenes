package ar.com.photoeditor.model.filters;

import ar.com.photoeditor.model.pixel.Pixel;

public abstract class AbstractFilter {
	
	static int[] rarray;
	static int[] garray;
	static int[] barray;
	
	public abstract Pixel[][] applyMethod(Pixel img[][]);
	public static void mascara(Pixel[][] p, int i, int j) {
		int runo = p[i - 1][j - 1].getR();
		int rdos = p[i - 1][j].getR();
		int rtres = p[i - 1][j + 1].getR();
		int rcuatro = p[i][j - 1].getR();
		int rcinco = p[i][j].getR();
		int rseis = p[i][j + 1].getR();
		int rsiete = p[i + 1][j - 1].getR();
		int rocho = p[i + 1][j].getR();
		int rnueve = p[i + 1][j + 1].getR();

		rarray = new int[] { runo, rdos, rtres, rcuatro, rcinco, rseis, rsiete, rocho, rnueve };

		int guno = p[i - 1][j - 1].getG();
		int gdos = p[i - 1][j].getG();
		int gtres = p[i - 1][j + 1].getG();
		int gcuatro = p[i][j - 1].getG();
		int gcinco = p[i][j].getG();
		int gseis = p[i][j + 1].getG();
		int gsiete = p[i + 1][j - 1].getG();
		int gocho = p[i + 1][j].getG();
		int gnueve = p[i + 1][j + 1].getG();

		garray = new int[] { guno, gdos, gtres, gcuatro, gcinco, gseis, gsiete, gocho, gnueve };

				
		int buno = p[i - 1][j - 1].getB();
		int bdos = p[i - 1][j].getB();
		int btres = p[i - 1][j + 1].getB();
		int bcuatro = p[i][j - 1].getB();
		int bcinco = p[i][j].getB();
		int bseis = p[i][j + 1].getB();
		int bsiete = p[i + 1][j - 1].getB();
		int bocho = p[i + 1][j].getB();
		int bnueve = p[i + 1][j + 1].getB();

		barray = new int[] { buno, bdos, btres, bcuatro, bcinco, bseis, bsiete, bocho, bnueve };

	}

}
