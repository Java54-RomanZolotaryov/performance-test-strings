package telran.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemoveStandard;

class SymbolsRemoveTest {
	
	final static String HELLO_WORLD = "Hello. *.World!";
	final static String EMPTY_STRING = "";

	@Test
	void symbolsRemoveCharArrayTest() {
		testSymbolsRemoveUtil(new SymbolsRemoveCharArray());
	}
	
	@Test
	void symbolsRemoveStandardTest() {
		testSymbolsRemoveUtil(new SymbolsRemoveStandard());
	}
	
	private void testSymbolsRemoveUtil(SymbolsRemove util) {
		
		//removes all occurrences of 'o' in "Hello World!"
		String expected = "Hell. *.Wrld!";
		String actual = util.removeSymbol(HELLO_WORLD, 'o');
		assertEquals(expected, actual);
		
		//removes all occurrences of 'X' in "Hello World!"
		expected = HELLO_WORLD;
		actual = util.removeSymbol(HELLO_WORLD, 'X');
		assertEquals(expected, actual);
		
		//removes all occurrences of 'A' in ""
		expected = EMPTY_STRING;
		actual = util.removeSymbol(EMPTY_STRING, 'A');
		assertEquals(expected, actual);
		
		//removes all occurrences of '?' in ""
		expected = EMPTY_STRING;
		actual = util.removeSymbol(EMPTY_STRING, '?');
		assertEquals(expected, actual);
		
		//removes all occurrences of '.' in "Hello. *.World!"
		expected = "Hello *World!";
		actual = util.removeSymbol(HELLO_WORLD, '.');
		assertEquals(expected, actual);
		
		//removes all occurrences of '*' in "Hello. *.World!"
		expected = "Hello. .World!";
		actual = util.removeSymbol(HELLO_WORLD, '*');
		assertEquals(expected, actual);
	}

}
