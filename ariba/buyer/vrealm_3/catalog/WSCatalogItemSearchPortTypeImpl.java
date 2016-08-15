
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ariba.buyer.vrealm_3.catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.17 2016-04-27T10:33:35.102+03:00
 * Generated source version: 2.7.17
 * 
 */

@javax.jws.WebService(serviceName = "WSCatalogItemSearch", portName = "WSCatalogItemSearchPortType", targetNamespace = "urn:Ariba:Buyer:vrealm_3", wsdlLocation = "WSCatalogItemSearch.wsdl", endpointInterface = "ariba.buyer.vrealm_3.WSCatalogItemSearchPortType")

public class WSCatalogItemSearchPortTypeImpl implements WSCatalogItemSearchPortType {

	private static final Logger LOG = Logger.getLogger(WSCatalogItemSearchPortTypeImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sap.ariba.WSCatalogItemSearchPortType#wsCatalogItemSearchOperation(
	 * com.sap.ariba.WSCatalogItemSearchRequest body )*
	 */
	public WSCatalogItemSearchReply wsCatalogItemSearchOperation(WSCatalogItemSearchRequest body) {
		LOG.info("Executing operation wsCatalogItemSearchOperation");
		System.out.println(body);
		try {
			WSCatalogItemSearchReply _return = new WSCatalogItemSearchReply();
			WSCatalogItemSearchReply.WSCatalogSearchResponseItem _returnWSCatalogSearchResponseItem = new WSCatalogItemSearchReply.WSCatalogSearchResponseItem();
			WSCatalogSearchResponse _returnWSCatalogSearchResponseItemItem = new WSCatalogSearchResponse();
			WSCatalogSearchResponse.CatalogItems _returnWSCatalogSearchResponseItemItemCatalogItems = new WSCatalogSearchResponse.CatalogItems();
			List<WSCatalogItem> _returnWSCatalogSearchResponseItemItemCatalogItemsItem = new ArrayList<WSCatalogItem>();
			_returnWSCatalogSearchResponseItemItemCatalogItems.getItem()
					.addAll(_returnWSCatalogSearchResponseItemItemCatalogItemsItem);
			_returnWSCatalogSearchResponseItemItem.setCatalogItems(_returnWSCatalogSearchResponseItemItemCatalogItems);
			WSCatalogSearchResponse.Errors _returnWSCatalogSearchResponseItemItemErrors = new WSCatalogSearchResponse.Errors();
			List<String> _returnWSCatalogSearchResponseItemItemErrorsItem = new ArrayList<String>();
			_returnWSCatalogSearchResponseItemItemErrors.getItem()
					.addAll(_returnWSCatalogSearchResponseItemItemErrorsItem);
			_returnWSCatalogSearchResponseItemItem.setErrors(_returnWSCatalogSearchResponseItemItemErrors);
			_returnWSCatalogSearchResponseItem.setItem(_returnWSCatalogSearchResponseItemItem);
			_return.setWSCatalogSearchResponseItem(_returnWSCatalogSearchResponseItem);
			_return.setPartition("Partition-1274586380");
			_return.setVariant("Variant-581526826");
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
