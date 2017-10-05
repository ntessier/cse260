
public class ComplexMatrix extends GenericMatrix<Complex> {
	/**
	 * Abstract method for adding two elements of the matrices
	 */
	@Override
	protected Complex add(Complex o1, Complex o2)
	{
		return (o1.add(o2));
	}

	/**
	 * Abstract method for multiplying two elements
	 */
	@Override
	protected Complex multiply(Complex o1, Complex o2)
	{
		return (o1.multiply(o2));
	}
	/**
	 * Abstract method for defining zero for the matrix element
	 */
	@Override
	protected Complex zero()
	{
		return new Complex();
	}

}
