package xml.test;

//import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-04-01 17:02
 **/
public class DOMTest  {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //建立DocumentBuilderFactor,用于获得DocumentBuilder对象:
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //2.建立DocumentBuidler:
        DocumentBuilder builder = factory.newDocumentBuilder();
        //3.建立Document对象，获取树的入口
        Document doc =  builder.parse("D:\\email\\src\\main\\java\\xml\\test\\test.xml");
        //4.建立NodeList
        NodeList node = doc.getElementsByTagName("book");
        //5.进行xml信息获取
        for(int i=0;i<node.getLength();i++){
            Element e = (Element)node.item(i);
            System.out.println("书名 :"+
                                e.getElementsByTagName("title").item(0).getFirstChild().getNodeValue());        //记住 这里的index为0
            System.out.println("作者 :"+
                                e.getElementsByTagName("author").item(0).getFirstChild().getNodeValue());
        }

    }
}
