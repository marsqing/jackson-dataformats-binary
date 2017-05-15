package com.fasterxml.jackson.dataformat.smile.async;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.fasterxml.jackson.core.async.NonBlockingInputFeeder;

public interface NonBlockingByteBufferFeeder extends NonBlockingInputFeeder
{
     /**
      * Method that can be called to feed more data, if (and only if)
      * {@link NonBlockingInputFeeder#needMoreInput} returns true.
      * 
      * @param buffer Buffer that contains additional input to read
      * 
      * @throws IOException if the state is such that this method should not be called
      *   (has not yet consumed existing input data, or has been marked as closed)
      */
     public void feedInput(ByteBuffer buffer) throws IOException;
}
