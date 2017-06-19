
package lifecoach.storage.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import lifecoach.localdb.webservice.Goal;
import lifecoach.localdb.webservice.GoalType;
import lifecoach.localdb.webservice.Measure;
import lifecoach.localdb.webservice.MeasureType;
import lifecoach.localdb.webservice.Person;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Storage", targetNamespace = "http://webservice.storage.lifecoach/")
@XmlSeeAlso({
    lifecoach.localdb.webservice.ObjectFactory.class,
    lifecoach.storage.webservice.ObjectFactory.class
})
public interface Storage {


    /**
     * 
     * @param personId
     * @return
     *     returns lifecoach.localdb.webservice.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadPersonResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/readPersonRequest", output = "http://webservice.storage.lifecoach/Storage/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.CreatePersonResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/createPersonRequest", output = "http://webservice.storage.lifecoach/Storage/createPersonResponse")
    public int createPerson(
        @WebParam(name = "person", targetNamespace = "http://webservice.storage.lifecoach/")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.UpdatePersonResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/updatePersonRequest", output = "http://webservice.storage.lifecoach/Storage/updatePersonResponse")
    public int updatePerson(
        @WebParam(name = "person", targetNamespace = "http://webservice.storage.lifecoach/")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.DeletePersonResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/deletePersonRequest", output = "http://webservice.storage.lifecoach/Storage/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param measureId
     * @param personId
     * @param measureTypeId
     * @return
     *     returns lifecoach.localdb.webservice.Measure
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readMeasure", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadMeasure")
    @ResponseWrapper(localName = "readMeasureResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadMeasureResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/readMeasureRequest", output = "http://webservice.storage.lifecoach/Storage/readMeasureResponse")
    public Measure readMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param personId
     * @param measureTypeId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Measure>
     */
    @WebMethod
    @WebResult(name = "measureList", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureHistory", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetMeasureHistory")
    @ResponseWrapper(localName = "getMeasureHistoryResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetMeasureHistoryResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getMeasureHistoryRequest", output = "http://webservice.storage.lifecoach/Storage/getMeasureHistoryResponse")
    public List<Measure> getMeasureHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId);

    /**
     * 
     * @param nMeasure
     * @param personId
     * @param measureTypeId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Measure>
     */
    @WebMethod
    @WebResult(name = "measureList", targetNamespace = "")
    @RequestWrapper(localName = "getSomeMeasure", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetSomeMeasure")
    @ResponseWrapper(localName = "getSomeMeasureResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetSomeMeasureResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getSomeMeasureRequest", output = "http://webservice.storage.lifecoach/Storage/getSomeMeasureResponse")
    public List<Measure> getSomeMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId,
        @WebParam(name = "nMeasure", targetNamespace = "")
        int nMeasure);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Measure>
     */
    @WebMethod
    @WebResult(name = "measureList", targetNamespace = "")
    @RequestWrapper(localName = "getLastMeasure", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetLastMeasure")
    @ResponseWrapper(localName = "getLastMeasureResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetLastMeasureResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getLastMeasureRequest", output = "http://webservice.storage.lifecoach/Storage/getLastMeasureResponse")
    public List<Measure> getLastMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "measureId", targetNamespace = "")
    @RequestWrapper(localName = "createMeasure", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.CreateMeasure")
    @ResponseWrapper(localName = "createMeasureResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.CreateMeasureResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/createMeasureRequest", output = "http://webservice.storage.lifecoach/Storage/createMeasureResponse")
    public int createMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "http://webservice.localdb.lifecoach/")
        Measure measure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "measureId", targetNamespace = "")
    @RequestWrapper(localName = "updateMeasure", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.UpdateMeasure")
    @ResponseWrapper(localName = "updateMeasureResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.UpdateMeasureResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/updateMeasureRequest", output = "http://webservice.storage.lifecoach/Storage/updateMeasureResponse")
    public int updateMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "http://webservice.localdb.lifecoach/")
        Measure measure);

    /**
     * 
     * @param measureId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteMeasure", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.DeleteMeasure")
    @ResponseWrapper(localName = "deleteMeasureResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.DeleteMeasureResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/deleteMeasureRequest", output = "http://webservice.storage.lifecoach/Storage/deleteMeasureResponse")
    public int deleteMeasure(
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param goalId
     * @return
     *     returns lifecoach.localdb.webservice.MeasureType
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureType", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadMeasureType")
    @ResponseWrapper(localName = "readMeasureTypeResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadMeasureTypeResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/readMeasureTypeRequest", output = "http://webservice.storage.lifecoach/Storage/readMeasureTypeResponse")
    public MeasureType readMeasureType(
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.MeasureType>
     */
    @WebMethod
    @WebResult(name = "measureTypeList", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureTypeList", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetMeasureTypeList")
    @ResponseWrapper(localName = "getMeasureTypeListResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetMeasureTypeListResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getMeasureTypeListRequest", output = "http://webservice.storage.lifecoach/Storage/getMeasureTypeListResponse")
    public List<MeasureType> getMeasureTypeList();

    /**
     * 
     * @param goalId
     * @param personId
     * @param measureTypeId
     * @return
     *     returns lifecoach.localdb.webservice.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoal", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadGoal")
    @ResponseWrapper(localName = "readGoalResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadGoalResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/readGoalRequest", output = "http://webservice.storage.lifecoach/Storage/readGoalResponse")
    public Goal readGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId,
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param title
     * @return
     *     returns lifecoach.localdb.webservice.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "getGoalByTitle", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetGoalByTitle")
    @ResponseWrapper(localName = "getGoalByTitleResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetGoalByTitleResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getGoalByTitleRequest", output = "http://webservice.storage.lifecoach/Storage/getGoalByTitleResponse")
    public Goal getGoalByTitle(
        @WebParam(name = "title", targetNamespace = "")
        String title);

    /**
     * 
     * @param personId
     * @param measureTypeId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Goal>
     */
    @WebMethod
    @WebResult(name = "goalList", targetNamespace = "")
    @RequestWrapper(localName = "getGoalHistory", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetGoalHistory")
    @ResponseWrapper(localName = "getGoalHistoryResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetGoalHistoryResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getGoalHistoryRequest", output = "http://webservice.storage.lifecoach/Storage/getGoalHistoryResponse")
    public List<Goal> getGoalHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "goalId", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.CreateGoalResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/createGoalRequest", output = "http://webservice.storage.lifecoach/Storage/createGoalResponse")
    public int createGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goal", targetNamespace = "http://webservice.localdb.lifecoach/")
        Goal goal);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "goalId", targetNamespace = "")
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.UpdateGoalResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/updateGoalRequest", output = "http://webservice.storage.lifecoach/Storage/updateGoalResponse")
    public int updateGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goal", targetNamespace = "http://webservice.localdb.lifecoach/")
        Goal goal);

    /**
     * 
     * @param goalId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.DeleteGoalResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/deleteGoalRequest", output = "http://webservice.storage.lifecoach/Storage/deleteGoalResponse")
    public int deleteGoal(
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param goalId
     * @return
     *     returns lifecoach.localdb.webservice.GoalType
     */
    @WebMethod
    @WebResult(name = "goalType", targetNamespace = "")
    @RequestWrapper(localName = "readGoalType", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadGoalType")
    @ResponseWrapper(localName = "readGoalTypeResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.ReadGoalTypeResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/readGoalTypeRequest", output = "http://webservice.storage.lifecoach/Storage/readGoalTypeResponse")
    public GoalType readGoalType(
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.GoalType>
     */
    @WebMethod
    @WebResult(name = "goalTypeList", targetNamespace = "")
    @RequestWrapper(localName = "getGoalTypeList", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetGoalTypeList")
    @ResponseWrapper(localName = "getGoalTypeListResponse", targetNamespace = "http://webservice.storage.lifecoach/", className = "lifecoach.storage.webservice.GetGoalTypeListResponse")
    @Action(input = "http://webservice.storage.lifecoach/Storage/getGoalTypeListRequest", output = "http://webservice.storage.lifecoach/Storage/getGoalTypeListResponse")
    public List<GoalType> getGoalTypeList();

}
