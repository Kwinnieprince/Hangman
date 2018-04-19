package domain;

public class TekeningHangMan extends Tekening{
	
	Vorm galgBodem = new Rechthoek(new Punt(10, 350), 300, 40);// altijd zichtbaar
	Vorm galgStaaf = new LijnStuk(new Punt(160, 350), new Punt(160, 50));// altijd zichtbaar
	Vorm hangbar = new LijnStuk(new Punt(160, 50), new Punt(280, 50));// altijd zichtbaar
	Vorm koord = new LijnStuk(new Punt(280, 50), new Punt(280, 100));// altijd zichtbaar
	Vorm hoofd = new Cirkel(new Punt(280, 125), 25);// zichtbaar na 1 fout
	Vorm oogLinks = new Cirkel(new Punt(270, 118), 2);// zichtbaar na 2 fouten
	Vorm oogRechts = new Cirkel(new Punt(290, 118), 2);//3
	Vorm neus = new Cirkel(new Punt(280, 128), 2);//4
	Vorm mond = new LijnStuk(new Punt(270, 138), new Punt(290, 138));//5
	Vorm lijf = new LijnStuk(new Punt(280, 150), new Punt(280, 250));//6
	Vorm beenLinks = new LijnStuk(new Punt(280, 250), new Punt(240, 310));//7
	Vorm beenRechts = new LijnStuk(new Punt(280, 250), new Punt(320, 310));//8
	Vorm voetLinks = new Cirkel(new Punt(240, 310), 5);//9
	Vorm voetRechts = new Cirkel(new Punt(320, 310), 5);//10
	Vorm armLinks = new LijnStuk(new Punt(280, 200), new Punt(230, 170));//11
	Vorm armRechts = new LijnStuk(new Punt(280, 200), new Punt(330, 170));//12
	Vorm handLinks = new Cirkel(new Punt(230, 170), 5);//13
	Vorm handRechts = new Cirkel(new Punt(330, 170), 5);//14


	public TekeningHangMan(String naam) {
		super(naam);	
		this.voegToe(galgBodem);//1
		this.voegToe(galgStaaf);//2
		this.voegToe(hangbar);//3
		this.voegToe(koord);//4
		this.voegToe(hoofd);//5
		this.voegToe(oogLinks);//6
		this.voegToe(oogRechts);//7
		this.voegToe(neus);//8
		this.voegToe(mond);//9
		this.voegToe(lijf);//10
		this.voegToe(beenLinks);//11
		this.voegToe(beenRechts);//12
		this.voegToe(voetLinks);//13
		this.voegToe(voetRechts);//14
		this.voegToe(armLinks);//15
		this.voegToe(armRechts);//16
		this.voegToe(handLinks);//17
		this.voegToe(handRechts);//18
	}
	
	public int getAantalOnzichtbaar() {
		int aantal = 0;
		
		for (Vorm vorm : vormen) {
			if(!vorm.isZichtbaar()) aantal++;
		}
		
		return aantal;
	}
	
	public void setVolgendeZichtbaar() {
		for (int i = 0; i < vormen.size(); i++) {
			if(!vormen.get(i).isZichtbaar()) {
				vormen.get(i).setZichtbaar(true);
				i = vormen.size();
			}
		}
	}
	
	public void reset() {
		for(int i = 4; i < vormen.size(); i++) {
			vormen.get(i).setZichtbaar(false);
		}
	}
	
}
