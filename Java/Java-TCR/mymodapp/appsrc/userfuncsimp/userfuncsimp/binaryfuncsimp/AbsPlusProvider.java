// This is a provider for the AbsPlus function

package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;

public class AbsPlusProvider implements BinFuncProvider
{
	// Provide and AbsPlus object.
	public BinaryFunc get()
	{
		return new AbsPlus();
	}
}