package ma.enset.infractionsservice.web.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: infraction.proto")
public final class InfractionGrpcServiceGrpc {

  private InfractionGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "InfractionGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest,
      ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse> getGetInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInfraction",
      requestType = ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest.class,
      responseType = ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest,
      ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse> getGetInfractionMethod() {
    io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest, ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse> getGetInfractionMethod;
    if ((getGetInfractionMethod = InfractionGrpcServiceGrpc.getGetInfractionMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getGetInfractionMethod = InfractionGrpcServiceGrpc.getGetInfractionMethod) == null) {
          InfractionGrpcServiceGrpc.getGetInfractionMethod = getGetInfractionMethod = 
              io.grpc.MethodDescriptor.<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest, ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "getInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("getInfraction"))
                  .build();
          }
        }
     }
     return getGetInfractionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest,
      ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse> getGetListInfractionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListInfractions",
      requestType = ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest.class,
      responseType = ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest,
      ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse> getGetListInfractionsMethod() {
    io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest, ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse> getGetListInfractionsMethod;
    if ((getGetListInfractionsMethod = InfractionGrpcServiceGrpc.getGetListInfractionsMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getGetListInfractionsMethod = InfractionGrpcServiceGrpc.getGetListInfractionsMethod) == null) {
          InfractionGrpcServiceGrpc.getGetListInfractionsMethod = getGetListInfractionsMethod = 
              io.grpc.MethodDescriptor.<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest, ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "getListInfractions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("getListInfractions"))
                  .build();
          }
        }
     }
     return getGetListInfractionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest,
      ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse> getSaveInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveInfraction",
      requestType = ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest.class,
      responseType = ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest,
      ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse> getSaveInfractionMethod() {
    io.grpc.MethodDescriptor<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest, ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse> getSaveInfractionMethod;
    if ((getSaveInfractionMethod = InfractionGrpcServiceGrpc.getSaveInfractionMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getSaveInfractionMethod = InfractionGrpcServiceGrpc.getSaveInfractionMethod) == null) {
          InfractionGrpcServiceGrpc.getSaveInfractionMethod = getSaveInfractionMethod = 
              io.grpc.MethodDescriptor.<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest, ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "saveInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("saveInfraction"))
                  .build();
          }
        }
     }
     return getSaveInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfractionGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new InfractionGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfractionGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InfractionGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InfractionGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InfractionGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InfractionGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getInfraction(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest request,
        io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfractionMethod(), responseObserver);
    }

    /**
     */
    public void getListInfractions(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListInfractionsMethod(), responseObserver);
    }

    /**
     */
    public void saveInfraction(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest request,
        io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest,
                ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse>(
                  this, METHODID_GET_INFRACTION)))
          .addMethod(
            getGetListInfractionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest,
                ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse>(
                  this, METHODID_GET_LIST_INFRACTIONS)))
          .addMethod(
            getSaveInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest,
                ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse>(
                  this, METHODID_SAVE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class InfractionGrpcServiceStub extends io.grpc.stub.AbstractStub<InfractionGrpcServiceStub> {
    private InfractionGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInfraction(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest request,
        io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListInfractions(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListInfractionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveInfraction(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest request,
        io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InfractionGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<InfractionGrpcServiceBlockingStub> {
    private InfractionGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse getInfraction(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfractionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse getListInfractions(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListInfractionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse saveInfraction(ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InfractionGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<InfractionGrpcServiceFutureStub> {
    private InfractionGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse> getInfraction(
        ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfractionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse> getListInfractions(
        ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListInfractionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse> saveInfraction(
        ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFRACTION = 0;
  private static final int METHODID_GET_LIST_INFRACTIONS = 1;
  private static final int METHODID_SAVE_INFRACTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InfractionGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InfractionGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFRACTION:
          serviceImpl.getInfraction((ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetInfractionResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_INFRACTIONS:
          serviceImpl.getListInfractions((ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.GetAllInfractionsResponse>) responseObserver);
          break;
        case METHODID_SAVE_INFRACTION:
          serviceImpl.saveInfraction((ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.SaveInfractionResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InfractionGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InfractionGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InfractionGrpcService");
    }
  }

  private static final class InfractionGrpcServiceFileDescriptorSupplier
      extends InfractionGrpcServiceBaseDescriptorSupplier {
    InfractionGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class InfractionGrpcServiceMethodDescriptorSupplier
      extends InfractionGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InfractionGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InfractionGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InfractionGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetInfractionMethod())
              .addMethod(getGetListInfractionsMethod())
              .addMethod(getSaveInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
