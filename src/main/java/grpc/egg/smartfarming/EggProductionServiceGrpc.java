package grpc.egg.smartfarming;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: eggproduction.proto")
public final class EggProductionServiceGrpc {

  private EggProductionServiceGrpc() {}

  public static final String SERVICE_NAME = "EggProductionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.egg.smartfarming.CalculateRequest,
      grpc.egg.smartfarming.CalculateResponse> getFeedingCalculatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedingCalculator",
      requestType = grpc.egg.smartfarming.CalculateRequest.class,
      responseType = grpc.egg.smartfarming.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.egg.smartfarming.CalculateRequest,
      grpc.egg.smartfarming.CalculateResponse> getFeedingCalculatorMethod() {
    io.grpc.MethodDescriptor<grpc.egg.smartfarming.CalculateRequest, grpc.egg.smartfarming.CalculateResponse> getFeedingCalculatorMethod;
    if ((getFeedingCalculatorMethod = EggProductionServiceGrpc.getFeedingCalculatorMethod) == null) {
      synchronized (EggProductionServiceGrpc.class) {
        if ((getFeedingCalculatorMethod = EggProductionServiceGrpc.getFeedingCalculatorMethod) == null) {
          EggProductionServiceGrpc.getFeedingCalculatorMethod = getFeedingCalculatorMethod = 
              io.grpc.MethodDescriptor.<grpc.egg.smartfarming.CalculateRequest, grpc.egg.smartfarming.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EggProductionService", "feedingCalculator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.egg.smartfarming.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.egg.smartfarming.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EggProductionServiceMethodDescriptorSupplier("feedingCalculator"))
                  .build();
          }
        }
     }
     return getFeedingCalculatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.egg.smartfarming.DailyEggCount,
      grpc.egg.smartfarming.WeeklyEggCount> getWeeklyTotalEggCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "weeklyTotalEggCount",
      requestType = grpc.egg.smartfarming.DailyEggCount.class,
      responseType = grpc.egg.smartfarming.WeeklyEggCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.egg.smartfarming.DailyEggCount,
      grpc.egg.smartfarming.WeeklyEggCount> getWeeklyTotalEggCountMethod() {
    io.grpc.MethodDescriptor<grpc.egg.smartfarming.DailyEggCount, grpc.egg.smartfarming.WeeklyEggCount> getWeeklyTotalEggCountMethod;
    if ((getWeeklyTotalEggCountMethod = EggProductionServiceGrpc.getWeeklyTotalEggCountMethod) == null) {
      synchronized (EggProductionServiceGrpc.class) {
        if ((getWeeklyTotalEggCountMethod = EggProductionServiceGrpc.getWeeklyTotalEggCountMethod) == null) {
          EggProductionServiceGrpc.getWeeklyTotalEggCountMethod = getWeeklyTotalEggCountMethod = 
              io.grpc.MethodDescriptor.<grpc.egg.smartfarming.DailyEggCount, grpc.egg.smartfarming.WeeklyEggCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EggProductionService", "weeklyTotalEggCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.egg.smartfarming.DailyEggCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.egg.smartfarming.WeeklyEggCount.getDefaultInstance()))
                  .setSchemaDescriptor(new EggProductionServiceMethodDescriptorSupplier("weeklyTotalEggCount"))
                  .build();
          }
        }
     }
     return getWeeklyTotalEggCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EggProductionServiceStub newStub(io.grpc.Channel channel) {
    return new EggProductionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EggProductionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EggProductionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EggProductionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EggProductionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EggProductionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary type rpc service: 1 request is sent by client, 1 response received from server
     * </pre>
     */
    public void feedingCalculator(grpc.egg.smartfarming.CalculateRequest request,
        io.grpc.stub.StreamObserver<grpc.egg.smartfarming.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeedingCalculatorMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming rpc service: client sends a stream of requests, receives 1 response from server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.egg.smartfarming.DailyEggCount> weeklyTotalEggCount(
        io.grpc.stub.StreamObserver<grpc.egg.smartfarming.WeeklyEggCount> responseObserver) {
      return asyncUnimplementedStreamingCall(getWeeklyTotalEggCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeedingCalculatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.egg.smartfarming.CalculateRequest,
                grpc.egg.smartfarming.CalculateResponse>(
                  this, METHODID_FEEDING_CALCULATOR)))
          .addMethod(
            getWeeklyTotalEggCountMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.egg.smartfarming.DailyEggCount,
                grpc.egg.smartfarming.WeeklyEggCount>(
                  this, METHODID_WEEKLY_TOTAL_EGG_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class EggProductionServiceStub extends io.grpc.stub.AbstractStub<EggProductionServiceStub> {
    private EggProductionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EggProductionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EggProductionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EggProductionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary type rpc service: 1 request is sent by client, 1 response received from server
     * </pre>
     */
    public void feedingCalculator(grpc.egg.smartfarming.CalculateRequest request,
        io.grpc.stub.StreamObserver<grpc.egg.smartfarming.CalculateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeedingCalculatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming rpc service: client sends a stream of requests, receives 1 response from server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.egg.smartfarming.DailyEggCount> weeklyTotalEggCount(
        io.grpc.stub.StreamObserver<grpc.egg.smartfarming.WeeklyEggCount> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getWeeklyTotalEggCountMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EggProductionServiceBlockingStub extends io.grpc.stub.AbstractStub<EggProductionServiceBlockingStub> {
    private EggProductionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EggProductionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EggProductionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EggProductionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary type rpc service: 1 request is sent by client, 1 response received from server
     * </pre>
     */
    public grpc.egg.smartfarming.CalculateResponse feedingCalculator(grpc.egg.smartfarming.CalculateRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeedingCalculatorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EggProductionServiceFutureStub extends io.grpc.stub.AbstractStub<EggProductionServiceFutureStub> {
    private EggProductionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EggProductionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EggProductionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EggProductionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary type rpc service: 1 request is sent by client, 1 response received from server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.egg.smartfarming.CalculateResponse> feedingCalculator(
        grpc.egg.smartfarming.CalculateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeedingCalculatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEEDING_CALCULATOR = 0;
  private static final int METHODID_WEEKLY_TOTAL_EGG_COUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EggProductionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EggProductionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FEEDING_CALCULATOR:
          serviceImpl.feedingCalculator((grpc.egg.smartfarming.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<grpc.egg.smartfarming.CalculateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WEEKLY_TOTAL_EGG_COUNT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.weeklyTotalEggCount(
              (io.grpc.stub.StreamObserver<grpc.egg.smartfarming.WeeklyEggCount>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EggProductionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EggProductionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.egg.smartfarming.EggProductionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EggProductionService");
    }
  }

  private static final class EggProductionServiceFileDescriptorSupplier
      extends EggProductionServiceBaseDescriptorSupplier {
    EggProductionServiceFileDescriptorSupplier() {}
  }

  private static final class EggProductionServiceMethodDescriptorSupplier
      extends EggProductionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EggProductionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EggProductionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EggProductionServiceFileDescriptorSupplier())
              .addMethod(getFeedingCalculatorMethod())
              .addMethod(getWeeklyTotalEggCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
