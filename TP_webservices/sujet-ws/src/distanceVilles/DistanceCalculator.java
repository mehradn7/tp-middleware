package distanceVilles;

import com.malaikaconsultants.ZipCodeWebService.ZIPCode;
import com.malaikaconsultants.ZipCodeWebService.ZIPCodeDistance;
import com.malaikaconsultants.ZipCodeWebService.ZipCodeDistanceLocator;
import com.malaikaconsultants.ZipCodeWebService.ZipCodeDistanceSoap;
import com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupLocator;
import com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap;

public class DistanceCalculator {
	public String getDistance(String nom1, String nom2, String etat1, String etat2) {
		ZipCodeDistanceLocator z = new ZipCodeDistanceLocator();
		ZipCodeLookupLocator z2 = new ZipCodeLookupLocator();
		String distanceRes = "";
		
		try{
			ZipCodeDistanceSoap zcds = z.getZipCodeDistanceSoap();
			ZipCodeLookupSoap zcls = z2.getZipCodeLookupSoap();
			ZIPCode[] zipcode = zcls.getZIPCodeForCityState(nom1, etat1);
			ZIPCode[] zipcode2 = zcls.getZIPCodeForCityState(nom2, etat2);
			
			ZIPCodeDistance zipcodedistance = zcds.getDistanceBetweenTwoZIPCodes(zipcode[0].getZipCode(), zipcode2[0].getZipCode());
			distanceRes = zipcodedistance.getDistance();

		}catch(Exception e){
			e.printStackTrace();
		}
		
		return distanceRes;

	}
}
