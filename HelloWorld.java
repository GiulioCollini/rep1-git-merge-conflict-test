// modifico il file HelloWorld.java dopo il conflitto in modo che funzioni coem da richiesto dal prof (stamopi sia il numero di processori che il nome dell'autore)
int procNumber() {
	return Runtime.getRuntime().availableProcessors();
}

void main2() {
	IO.println("This program is running in a PC with " + procNumber() + " logic processors!");
}
final String AUTHOR = "Danilo Pianini";

void main() {
	IO.println("This program has been realised by " + AUTHOR);

}
