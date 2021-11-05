package grpc.smartfarming;

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
    comments = "Source: appleproduction.proto")
public final class AppleProductionServiceGrpc {

  private AppleProductionServiceGrpc() {}

  public static final String SERVICE_NAME = "AppleProductionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.smartfarming.ApplePrice,
      grpc.smartfarming.WeeklyApplePrice> getFeedingCalculatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedingCalculator",
      requestType = grpc.smartfarming.ApplePrice.class,
      responseType = grpc.smartfarming.WeeklyApplePrice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.smartfarming.ApplePrice,
      grpc.smartfarming.WeeklyApplePrice> getFeedingCalculatorMethod() {
    io.grpc.MethodDescriptor<grpc.smartfarming.ApplePrice, grpc.smartfarming.WeeklyApplePrice> getFeedingCalculatorMethod;
    if ((getFeedingCalculatorMethod = AppleProductionServiceGrpc.getFeedingCalculatorMethod) == null) {
      synchronized (AppleProductionServiceGrpc.class) {
        if ((getFeedingCalculatorMethod = AppleProductionServiceGrpc.getFeedingCalculatorMethod) == null) {
          AppleProductionServiceGrpc.getFeedingCalculatorMethod = getFeedingCalculatorMethod = 
              io.grpc.MethodDescriptor.<grpc.smartfarming.ApplePrice, grpc.smartfarming.WeeklyApplePrice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AppleProductionService", "feedingCalculator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartfarming.ApplePrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartfarming.WeeklyApplePrice.getDefaultInstance()))
                  .setSchemaDescriptor(new AppleProductionServiceMethodDescriptorSupplier("feedingCalculator"))
                  .build();
          }
        }
     }
     return getFeedingCalculatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.smartfarming.WeeklyAppleSale,
      grpc.smartfarming.WeeklyAppleSaleValue> getWeeklyTotalEggCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "weeklyTotalEggCount",
      requestType = grpc.smartfarming.WeeklyAppleSale.class,
      responseType = grpc.smartfarming.WeeklyAppleSaleValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.smartfarming.WeeklyAppleSale,
      grpc.smartfarming.WeeklyAppleSaleValue> getWeeklyTotalEggCountMethod() {
    io.grpc.MethodDescriptor<grpc.smartfarming.WeeklyAppleSale, grpc.smartfarming.WeeklyAppleSaleValue> getWeeklyTotalEggCountMethod;
    if ((getWeeklyTotalEggCountMethod = AppleProductionServiceGrpc.getWeeklyTotalEggCountMethod) == null) {
      synchronized (AppleProductionServiceGrpc.class) {
        if ((getWeeklyTotalEggCountMethod = AppleProductionServiceGrpc.getWeeklyTotalEggCountMethod) == null) {
          AppleProductionServiceGrpc.getWeeklyTotalEggCountMethod = getWeeklyTotalEggCountMethod = 
              io.grpc.MethodDescriptor.<grpc.smartfarming.WeeklyAppleSale, grpc.smartfarming.WeeklyAppleSaleValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AppleProductionService", "weeklyTotalEggCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartfarming.WeeklyAppleSale.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartfarming.WeeklyAppleSaleValue.getDefaultInstance()))
                  .setSchemaDescriptor(new AppleProductionServiceMethodDescriptorSupplier("weeklyTotalEggCount"))
                  .build();
          }
        }
     }
     return getWeeklyTotalEggCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppleProductionServiceStub newStub(io.grpc.Channel channel) {
    return new AppleProductionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppleProductionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AppleProductionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppleProductionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AppleProductionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AppleProductionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming rpc service: 1 request is sent by client, server sends a stream of responses
     * </pre>
     */
    public void feedingCalculator(grpc.smartfarming.ApplePrice request,
        io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyApplePrice> responseObserver) {
      asyncUnimplementedUnaryCall(getFeedingCalculatorMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming rpc service: client sends a stream of requests, receives a stream of responses from server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyAppleSale> weeklyTotalEggCount(
        io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyAppleSaleValue> responseObserver) {
      return asyncUnimplementedStreamingCall(getWeeklyTotalEggCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeedingCalculatorMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.smartfarming.ApplePrice,
                grpc.smartfarming.WeeklyApplePrice>(
                  this, METHODID_FEEDING_CALCULATOR)))
          .addMethod(
            getWeeklyTotalEggCountMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.smartfarming.WeeklyAppleSale,
                grpc.smartfarming.WeeklyAppleSaleValue>(
                  this, METHODID_WEEKLY_TOTAL_EGG_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class AppleProductionServiceStub extends io.grpc.stub.AbstractStub<AppleProductionServiceStub> {
    private AppleProductionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppleProductionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppleProductionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppleProductionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming rpc service: 1 request is sent by client, server sends a stream of responses
     * </pre>
     */
    public void feedingCalculator(grpc.smartfarming.ApplePrice request,
        io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyApplePrice> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFeedingCalculatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming rpc service: client sends a stream of requests, receives a stream of responses from server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyAppleSale> weeklyTotalEggCount(
        io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyAppleSaleValue> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getWeeklyTotalEggCountMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AppleProductionServiceBlockingStub extends io.grpc.stub.AbstractStub<AppleProductionServiceBlockingStub> {
    private AppleProductionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppleProductionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppleProductionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppleProductionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming rpc service: 1 request is sent by client, server sends a stream of responses
     * </pre>
     */
    public java.util.Iterator<grpc.smartfarming.WeeklyApplePrice> feedingCalculator(
        grpc.smartfarming.ApplePrice request) {
      return blockingServerStreamingCall(
          getChannel(), getFeedingCalculatorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppleProductionServiceFutureStub extends io.grpc.stub.AbstractStub<AppleProductionServiceFutureStub> {
    private AppleProductionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppleProductionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppleProductionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppleProductionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FEEDING_CALCULATOR = 0;
  private static final int METHODID_WEEKLY_TOTAL_EGG_COUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppleProductionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppleProductionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FEEDING_CALCULATOR:
          serviceImpl.feedingCalculator((grpc.smartfarming.ApplePrice) request,
              (io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyApplePrice>) responseObserver);
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
              (io.grpc.stub.StreamObserver<grpc.smartfarming.WeeklyAppleSaleValue>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AppleProductionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppleProductionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.smartfarming.AppleProductionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppleProductionService");
    }
  }

  private static final class AppleProductionServiceFileDescriptorSupplier
      extends AppleProductionServiceBaseDescriptorSupplier {
    AppleProductionServiceFileDescriptorSupplier() {}
  }

  private static final class AppleProductionServiceMethodDescriptorSupplier
      extends AppleProductionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppleProductionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppleProductionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppleProductionServiceFileDescriptorSupplier())
              .addMethod(getFeedingCalculatorMethod())
              .addMethod(getWeeklyTotalEggCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
