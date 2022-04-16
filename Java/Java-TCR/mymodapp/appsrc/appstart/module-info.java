// Module definition for the main application module.
// It now uses BinFuncProvider.

module appstart
{
	// Requires the module appfuncs and userfuncs.
	requires appfuncs;
	requires userfuncs;
	
	// appstart now uses BinFuncProvider
	uses userfuncs.binaryfuncs.BinFuncProvider;
}