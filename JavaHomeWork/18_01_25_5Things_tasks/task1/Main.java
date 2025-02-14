class Main {
	public static void main(String[] args) {
		MusicalInstrument[] instruments = {
            new Guitar("YAMAHA", 60000.0, TypeOfGuitar.BASS),
            new Piano("YAMAHA", 100000.0, TypeOfPiano.CLASSIC)
        };

        for (MusicalInstrument instrument : instruments) {
        	System.out.println(instrument.displayInfo());
        	System.out.println(instrument.play());
            instrument.tuning();
            System.out.println();
        }
	}
}