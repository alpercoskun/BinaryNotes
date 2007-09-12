
package test.org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "ITUType1" )
    public class ITUType1 implements IASN1PreparedElement {
    
            @ASN1String( name = "ITUType1", 
        stringType =  UniversalTag.VisibleString , isUCS = false )
            
            private String value;
            
            public ITUType1() {
            }

            public ITUType1(String value) {
                this.value = value;
            }
            
            public void setValue(String value) {
                this.value = value;
            }
            
            public String getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ITUType1.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            