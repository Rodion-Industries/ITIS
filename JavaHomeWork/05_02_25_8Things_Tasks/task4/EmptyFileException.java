// собственное исключение EmptyFileException, которое наследуется от класса Exception
class EmptyFileException extends Exception {
	public EmptyFileException(String message) {
		super(message);
	}
}