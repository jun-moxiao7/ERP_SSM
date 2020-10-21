package com.tledu.zrz.util;

import com.tledu.zrz.dao.IATDao;
import com.tledu.zrz.dao.ICheckDao;
import com.tledu.zrz.dao.IDeptDao;
import com.tledu.zrz.dao.IEvalutionDao;
import com.tledu.zrz.dao.IExamDao;
import com.tledu.zrz.dao.IInformDao;
import com.tledu.zrz.dao.IMoneyDao;
import com.tledu.zrz.dao.IMouldDao;
import com.tledu.zrz.dao.IPmceDao;
import com.tledu.zrz.dao.IQuality_testingDao;
import com.tledu.zrz.dao.IRecordDao;
import com.tledu.zrz.dao.IReportDao;
import com.tledu.zrz.dao.IResignDao;
import com.tledu.zrz.dao.ITrainDao;
import com.tledu.zrz.dao.ITransferDao;
import com.tledu.zrz.dao.IUnqualifiedDao;
import com.tledu.zrz.dao.IUserDao;
import com.tledu.zrz.dao.impl.ATDao;
import com.tledu.zrz.dao.impl.CheckDao;
import com.tledu.zrz.dao.impl.DeptDao;
import com.tledu.zrz.dao.impl.EvalutionDao;
import com.tledu.zrz.dao.impl.ExamDao;
import com.tledu.zrz.dao.impl.InformDao;
import com.tledu.zrz.dao.impl.MoneyDao;
import com.tledu.zrz.dao.impl.MouldDao;
import com.tledu.zrz.dao.impl.PmceDao;
import com.tledu.zrz.dao.impl.Quality_testingDao;
import com.tledu.zrz.dao.impl.RecordDao;
import com.tledu.zrz.dao.impl.ReportDao;
import com.tledu.zrz.dao.impl.ResignDao;
import com.tledu.zrz.dao.impl.TrainDao;
import com.tledu.zrz.dao.impl.TransferDao;
import com.tledu.zrz.dao.impl.UnqualifiedDao;
import com.tledu.zrz.dao.impl.UserDao;
import com.tledu.zrz.service.IATService;
import com.tledu.zrz.service.ICheckService;
import com.tledu.zrz.service.IDeptService;
import com.tledu.zrz.service.IEvalutionService;
import com.tledu.zrz.service.IExamService;
import com.tledu.zrz.service.IInformService;
import com.tledu.zrz.service.IMoneyService;
import com.tledu.zrz.service.IMouldService;
import com.tledu.zrz.service.IPmceService;
import com.tledu.zrz.service.IQuality_testingService;
import com.tledu.zrz.service.IRecordService;
import com.tledu.zrz.service.IReportService;
import com.tledu.zrz.service.IResignService;
import com.tledu.zrz.service.ITrainService;
import com.tledu.zrz.service.ITransferService;
import com.tledu.zrz.service.IUnqualifiedService;
import com.tledu.zrz.service.IUserService;
import com.tledu.zrz.service.impl.ATService;
import com.tledu.zrz.service.impl.CheckService;
import com.tledu.zrz.service.impl.DeptService;
import com.tledu.zrz.service.impl.EvalutionService;
import com.tledu.zrz.service.impl.ExamService;
import com.tledu.zrz.service.impl.InformService;
import com.tledu.zrz.service.impl.MoneyService;
import com.tledu.zrz.service.impl.MouldService;
import com.tledu.zrz.service.impl.PmceService;
import com.tledu.zrz.service.impl.Quality_testingService;
import com.tledu.zrz.service.impl.RecordService;
import com.tledu.zrz.service.impl.ReportService;
import com.tledu.zrz.service.impl.ResignService;
import com.tledu.zrz.service.impl.TrainService;
import com.tledu.zrz.service.impl.TransferService;
import com.tledu.zrz.service.impl.UnqualifiedService;
import com.tledu.zrz.service.impl.UserService;

public class ObjectFactory {

	public static IUserService getUserService(){
		return new UserService();
	}
	
	public static IUserDao getUserDao(){
		return new UserDao();
	}
	
	public static IDeptService getDeptService(){
		return new DeptService();
	}
	
	public static IDeptDao getDeptDao(){
		return new DeptDao();
	}
	public static IResignService getResignService(){
		return new ResignService();
	}
	
	public static IResignDao getResignDao(){
		return new ResignDao();
	}
	public static ITransferService getTransferService(){
		return new TransferService();
	}
	
	public static ITransferDao getTransferDao(){
		return new TransferDao();
	}
	public static IInformService getInformService(){
		return new InformService();
	}
	
	public static IInformDao getInformDao(){
		return new InformDao();
	}

	public static IEvalutionService getEvalutionService() {
		// TODO Auto-generated method stub
		return new EvalutionService() ;
	}
	public static IEvalutionDao getEvalutionDao(){
		return new EvalutionDao();
	}
	public static IMouldService getMouldService() {
		// TODO Auto-generated method stub
		return new MouldService() ;
	}
	public static IMouldDao getMouldDao(){
		return new MouldDao();
	}
	public static IATService getATService() {
		// TODO Auto-generated method stub
		return new ATService() ;
	}
	public static IATDao getATDao(){
		return new ATDao();
	}
	public static IRecordService getRecordService() {
		// TODO Auto-generated method stub
		return new RecordService();
	}
	public static IRecordDao getRecordDao() {
		// TODO Auto-generated method stub
		return new RecordDao();
	}

	public static IMoneyService getMoneyService() {
		// TODO Auto-generated method stub
		return new MoneyService();
	}
	public static IMoneyDao getMoneyDao() {
		// TODO Auto-generated method stub
		return new MoneyDao();
	}
	public static IPmceService getPmceService() {
		// TODO Auto-generated method stub
		return new PmceService();
	}
	public static IPmceDao getPmceDao() {
		// TODO Auto-generated method stub
		return new PmceDao();
	}
	public static ICheckService getCheckService() {
		// TODO Auto-generated method stub
		return new CheckService();
	}
	public static ICheckDao getCheckDao() {
		// TODO Auto-generated method stub
		return new CheckDao();
	}
	public static IReportService getReportService(){
		return new ReportService();
	}
	
	public static IReportDao getReportDao(){
		return new ReportDao();
	}
	public static IUnqualifiedService getUnqualifiedService(){
		return new UnqualifiedService();
	}
	
	public static IUnqualifiedDao getUnqualifiedDao(){
		return new UnqualifiedDao();
	}
	public static IExamService getExamService(){
		return new ExamService();
	}
	
	public static IExamDao getExamDao(){
		return new ExamDao();
	}
	public static IQuality_testingService getQuality_testingService(){
		return new Quality_testingService();
	}
	
	public static IQuality_testingDao getQuality_testingDao(){
		return new Quality_testingDao();
	}
	public static ITrainService getTrainService(){
		return new TrainService();
	}
	
	public static ITrainDao getTrainDao(){
		return new TrainDao();
	}
}
