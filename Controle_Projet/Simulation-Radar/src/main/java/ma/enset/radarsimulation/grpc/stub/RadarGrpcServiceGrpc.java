package ma.enset.radarsimulation.grpc.stub;

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
    comments = "Source: radar.proto")
public final class RadarGrpcServiceGrpc {

  private RadarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse> getGetRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRadar",
      requestType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest.class,
      responseType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse> getGetRadarMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse> getGetRadarMethod;
    if ((getGetRadarMethod = RadarGrpcServiceGrpc.getGetRadarMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getGetRadarMethod = RadarGrpcServiceGrpc.getGetRadarMethod) == null) {
          RadarGrpcServiceGrpc.getGetRadarMethod = getGetRadarMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "getRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("getRadar"))
                  .build();
          }
        }
     }
     return getGetRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse> getGetListRadarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListRadars",
      requestType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest.class,
      responseType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse> getGetListRadarsMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse> getGetListRadarsMethod;
    if ((getGetListRadarsMethod = RadarGrpcServiceGrpc.getGetListRadarsMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getGetListRadarsMethod = RadarGrpcServiceGrpc.getGetListRadarsMethod) == null) {
          RadarGrpcServiceGrpc.getGetListRadarsMethod = getGetListRadarsMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "getListRadars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("getListRadars"))
                  .build();
          }
        }
     }
     return getGetListRadarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse> getSaveRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveRadar",
      requestType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest.class,
      responseType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse> getSaveRadarMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse> getSaveRadarMethod;
    if ((getSaveRadarMethod = RadarGrpcServiceGrpc.getSaveRadarMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getSaveRadarMethod = RadarGrpcServiceGrpc.getSaveRadarMethod) == null) {
          RadarGrpcServiceGrpc.getSaveRadarMethod = getSaveRadarMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "saveRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("saveRadar"))
                  .build();
          }
        }
     }
     return getSaveRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed> getRadarControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "radarControl",
      requestType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest.class,
      responseType = ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest,
      ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed> getRadarControlMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed> getRadarControlMethod;
    if ((getRadarControlMethod = RadarGrpcServiceGrpc.getRadarControlMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getRadarControlMethod = RadarGrpcServiceGrpc.getRadarControlMethod) == null) {
          RadarGrpcServiceGrpc.getRadarControlMethod = getRadarControlMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest, ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "radarControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("radarControl"))
                  .build();
          }
        }
     }
     return getRadarControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new RadarGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRadar(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarMethod(), responseObserver);
    }

    /**
     */
    public void getListRadars(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListRadarsMethod(), responseObserver);
    }

    /**
     */
    public void saveRadar(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveRadarMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest> radarControl(
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed> responseObserver) {
      return asyncUnimplementedStreamingCall(getRadarControlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest,
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse>(
                  this, METHODID_GET_RADAR)))
          .addMethod(
            getGetListRadarsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest,
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse>(
                  this, METHODID_GET_LIST_RADARS)))
          .addMethod(
            getSaveRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest,
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse>(
                  this, METHODID_SAVE_RADAR)))
          .addMethod(
            getRadarControlMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest,
                ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed>(
                  this, METHODID_RADAR_CONTROL)))
          .build();
    }
  }

  /**
   */
  public static final class RadarGrpcServiceStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceStub> {
    private RadarGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRadar(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListRadars(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListRadarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveRadar(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest> radarControl(
        io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRadarControlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RadarGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceBlockingStub> {
    private RadarGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse getRadar(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse getListRadars(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListRadarsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse saveRadar(ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveRadarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceFutureStub> {
    private RadarGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse> getRadar(
        ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse> getListRadars(
        ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListRadarsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse> saveRadar(
        ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveRadarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RADAR = 0;
  private static final int METHODID_GET_LIST_RADARS = 1;
  private static final int METHODID_SAVE_RADAR = 2;
  private static final int METHODID_RADAR_CONTROL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RADAR:
          serviceImpl.getRadar((ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetRadarResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_RADARS:
          serviceImpl.getListRadars((ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.GetAllRadarsResponse>) responseObserver);
          break;
        case METHODID_SAVE_RADAR:
          serviceImpl.saveRadar((ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.SaveRadarResponse>) responseObserver);
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
        case METHODID_RADAR_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.radarControl(
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulation.grpc.stub.RadarOuterClass.DetectOverSpeed>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.radarsimulation.grpc.stub.RadarOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarGrpcService");
    }
  }

  private static final class RadarGrpcServiceFileDescriptorSupplier
      extends RadarGrpcServiceBaseDescriptorSupplier {
    RadarGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class RadarGrpcServiceMethodDescriptorSupplier
      extends RadarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetRadarMethod())
              .addMethod(getGetListRadarsMethod())
              .addMethod(getSaveRadarMethod())
              .addMethod(getRadarControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
