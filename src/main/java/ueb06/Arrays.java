package ueb06;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */

	static <T> String toString(T[] array) {
		if(array.length == 0)
			return "[]";

		String str = "[";
		return toStringHilf(0, array, str);
	}

    static <T> String toStringHilf(int i,T[]array, String str)
	{
		if(i == array.length-1)
	  	return str + array[i]+ "]";
	  else
	  	str +=  array[i] + ", ";
	  return toStringHilf(i+1, array, str);

	}
	/**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object) {
		return containsHilf(0, array, object);
	}

	static <T> boolean containsHilf(int i, T[] array, T object){
		if(i == array.length)
			return false;
		if(array[i].equals(object))
			return true;
		else
			return containsHilf(i+1, array, object);
	}
}
