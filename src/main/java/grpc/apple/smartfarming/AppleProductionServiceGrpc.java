package grpc.apple.smartfarming;

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
 * <pre>
 *service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: appleproduction.proto")
public final class AppleProductionServiceGrpc {

  private AppleProductionServiceGrpc() {}

  public static final String SERVICE_NAME = "AppleProductionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.apple.smartfarming.ApplePrice,
      grpc.apple.smartfarming.WeeklyApplePrice> getApplePriceCheckerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "applePriceChecker",
      requestType = grpc.apple.smartfarming.ApplePrice.class,
      responseType = grpc.apple.smartfarming.WeeklyApplePrice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.apple.smartfarming.ApplePrice,
      grpc.apple.smartfarming.WeeklyApplePrice> getApplePriceCheckerMethod() {
    io.grpc.MethodDescriptor<grpc.apple.smartfarming.ApplePrice, grpc.apple.smartfarming.WeeklyApplePrice> getApplePriceCheckerMethod;
    if ((getApplePriceCheckerMethod = AppleProductionServiceGrpc.getApplePriceCheckerMethod) == null) {
      synchronized (AppleProductionServiceGrpc.class) {
        if ((getApplePriceCheckerMethod = AppleProductionServiceGrpc.getApplePriceCheckerMethod) == null) {
          AppleProductionServiceGrpc.getApplePriceCheckerMethod = getApplePriceCheckerMethod = 
              io.grpc.MethodDescriptor.<grpc.apple.smartfarming.ApplePrice, grpc.apple.smartfarming.WeeklyApplePrice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AppleProductionService", "applePriceChecker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.apple.smartfarming.ApplePrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.apple.smartfarming.WeeklyApplePrice.getDefaultInstance()))
                  .setSchemaDescriptor(new AppleProductionServiceMethodDescriptorSupplier("applePriceChecker"))
                  .build();
          }
        }
     }
     return getApplePriceCheckerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.apple.smartfarming.WeeklyAppleSale,
      grpc.apple.smartfarming.WeeklyAppleSaleValue> getWeeklyAppleSalesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "weeklyAppleSales",
      requestType = grpc.apple.smartfarming.WeeklyAppleSale.class,
      responseType = grpc.apple.smartfarming.WeeklyAppleSaleValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.apple.smartfarming.WeeklyAppleSale,
      grpc.apple.smartfarming.WeeklyAppleSaleValue> getWeeklyAppleSalesMethod() {
    io.grpc.MethodDescriptor<grpc.apple.smartfarming.WeeklyAppleSale, grpc.apple.smartfarming.WeeklyAppleSaleValue> getWeeklyAppleSalesMethod;
    if ((getWeeklyAppleSalesMethod = AppleProductionServiceGrpc.getWeeklyAppleSalesMethod) == null) {
      synchronized (AppleProductionServiceGrpc.class) {
        if ((getWeeklyAppleSalesMethod = AppleProductionServiceGrpc.getWeeklyAppleSalesMethod) == null) {
          AppleProductionServiceGrpc.getWeeklyAppleSalesMethod = getWeeklyAppleSalesMethod = 
              io.grpc.MethodDescriptor.<grpc.apple.smartfarming.WeeklyAppleSale, grpc.apple.smartfarming.WeeklyAppleSaleValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AppleProductionService", "weeklyAppleSales"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.apple.smartfarming.WeeklyAppleSale.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.apple.smartfarming.WeeklyAppleSaleValue.getDefaultInstance()))
                  .setSchemaDescriptor(new AppleProductionServiceMethodDescriptorSupplier("weeklyAppleSales"))
                  .build();
          }
        }
     }
     return getWeeklyAppleSalesMethod;
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
   * <pre>
   *service definition
   * </pre>
   */
  public static abstract class AppleProductionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming rpc service: 1 request is sent by client
     *the server sends a stream of responses
     * </pre>
     */
    public void applePriceChecker(grpc.apple.smartfarming.ApplePrice request,
        io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyApplePrice> responseObserver) {
      asyncUnimplementedUnaryCall(getApplePriceCheckerMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming rpc service: client sends a stream of requests
     *and receives a stream of responses from server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyAppleSale> weeklyAppleSales(
        io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyAppleSaleValue> responseObserver) {
      return asyncUnimplementedStreamingCall(getWeeklyAppleSalesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplePriceCheckerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.apple.smartfarming.ApplePrice,
                grpc.apple.smartfarming.WeeklyApplePrice>(
                  this, METHODID_APPLE_PRICE_CHECKER)))
          .addMethod(
            getWeeklyAppleSalesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.apple.smartfarming.WeeklyAppleSale,
                grpc.apple.smartfarming.WeeklyAppleSaleValue>(
                  this, METHODID_WEEKLY_APPLE_SALES)))
          .build();
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
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
     *server streaming rpc service: 1 request is sent by client
     *the server sends a stream of responses
     * </pre>
     */
    public void applePriceChecker(grpc.apple.smartfarming.ApplePrice request,
        io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyApplePrice> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getApplePriceCheckerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming rpc service: client sends a stream of requests
     *and receives a stream of responses from server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyAppleSale> weeklyAppleSales(
        io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyAppleSaleValue> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getWeeklyAppleSalesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
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
     *server streaming rpc service: 1 request is sent by client
     *the server sends a stream of responses
     * </pre>
     */
    public java.util.Iterator<grpc.apple.smartfarming.WeeklyApplePrice> applePriceChecker(
        grpc.apple.smartfarming.ApplePrice request) {
      return blockingServerStreamingCall(
          getChannel(), getApplePriceCheckerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
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

  private static final int METHODID_APPLE_PRICE_CHECKER = 0;
  private static final int METHODID_WEEKLY_APPLE_SALES = 1;

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
        case METHODID_APPLE_PRICE_CHECKER:
          serviceImpl.applePriceChecker((grpc.apple.smartfarming.ApplePrice) request,
              (io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyApplePrice>) responseObserver);
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
        case METHODID_WEEKLY_APPLE_SALES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.weeklyAppleSales(
              (io.grpc.stub.StreamObserver<grpc.apple.smartfarming.WeeklyAppleSaleValue>) responseObserver);
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
      return grpc.apple.smartfarming.AppleProductionServiceImpl.getDescriptor();
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
              .addMethod(getApplePriceCheckerMethod())
              .addMethod(getWeeklyAppleSalesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
