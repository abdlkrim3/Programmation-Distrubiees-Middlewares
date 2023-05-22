package ma.enset.immatriculation_service.web.grpc.stub;

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
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse> getGetProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaire",
      requestType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest.class,
      responseType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse> getGetProprietaireMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse> getGetProprietaireMethod;
    if ((getGetProprietaireMethod = ImmatriculationServiceGrpc.getGetProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetProprietaireMethod = ImmatriculationServiceGrpc.getGetProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getGetProprietaireMethod = getGetProprietaireMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getProprietaire"))
                  .build();
          }
        }
     }
     return getGetProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse> getGetListProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListProprietaire",
      requestType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest.class,
      responseType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse> getGetListProprietaireMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse> getGetListProprietaireMethod;
    if ((getGetListProprietaireMethod = ImmatriculationServiceGrpc.getGetListProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetListProprietaireMethod = ImmatriculationServiceGrpc.getGetListProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getGetListProprietaireMethod = getGetListProprietaireMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getListProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getListProprietaire"))
                  .build();
          }
        }
     }
     return getGetListProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse> getSaveProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProprietaire",
      requestType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest.class,
      responseType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse> getSaveProprietaireMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse> getSaveProprietaireMethod;
    if ((getSaveProprietaireMethod = ImmatriculationServiceGrpc.getSaveProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getSaveProprietaireMethod = ImmatriculationServiceGrpc.getSaveProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getSaveProprietaireMethod = getSaveProprietaireMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "saveProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("saveProprietaire"))
                  .build();
          }
        }
     }
     return getSaveProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse> getGetVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicule",
      requestType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest.class,
      responseType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse> getGetVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse> getGetVehiculeMethod;
    if ((getGetVehiculeMethod = ImmatriculationServiceGrpc.getGetVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehiculeMethod = ImmatriculationServiceGrpc.getGetVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehiculeMethod = getGetVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getVehicule"))
                  .build();
          }
        }
     }
     return getGetVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse> getGetListVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListVehicule",
      requestType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest.class,
      responseType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse> getGetListVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse> getGetListVehiculeMethod;
    if ((getGetListVehiculeMethod = ImmatriculationServiceGrpc.getGetListVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetListVehiculeMethod = ImmatriculationServiceGrpc.getGetListVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getGetListVehiculeMethod = getGetListVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getListVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getListVehicule"))
                  .build();
          }
        }
     }
     return getGetListVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse> getSaveVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicule",
      requestType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest.class,
      responseType = ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest,
      ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse> getSaveVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse> getSaveVehiculeMethod;
    if ((getSaveVehiculeMethod = ImmatriculationServiceGrpc.getSaveVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getSaveVehiculeMethod = ImmatriculationServiceGrpc.getSaveVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getSaveVehiculeMethod = getSaveVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest, ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "saveVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("saveVehicule"))
                  .build();
          }
        }
     }
     return getSaveVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getListProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void saveProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getListVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest,
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE)))
          .addMethod(
            getGetListProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest,
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse>(
                  this, METHODID_GET_LIST_PROPRIETAIRE)))
          .addMethod(
            getSaveProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest,
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse>(
                  this, METHODID_SAVE_PROPRIETAIRE)))
          .addMethod(
            getGetVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest,
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse>(
                  this, METHODID_GET_VEHICULE)))
          .addMethod(
            getGetListVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest,
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse>(
                  this, METHODID_GET_LIST_VEHICULE)))
          .addMethod(
            getSaveVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest,
                ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse>(
                  this, METHODID_SAVE_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse getProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse getListProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse saveProprietaire(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse getVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse getListVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse saveVehicule(ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse> getProprietaire(
        ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse> getListProprietaire(
        ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse> saveProprietaire(
        ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse> getVehicule(
        ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse> getListVehicule(
        ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse> saveVehicule(
        ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE = 0;
  private static final int METHODID_GET_LIST_PROPRIETAIRE = 1;
  private static final int METHODID_SAVE_PROPRIETAIRE = 2;
  private static final int METHODID_GET_VEHICULE = 3;
  private static final int METHODID_GET_LIST_VEHICULE = 4;
  private static final int METHODID_SAVE_VEHICULE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE:
          serviceImpl.getProprietaire((ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetProprietaireResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_PROPRIETAIRE:
          serviceImpl.getListProprietaire((ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllProprietairesResponse>) responseObserver);
          break;
        case METHODID_SAVE_PROPRIETAIRE:
          serviceImpl.saveProprietaire((ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveProprietaireResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULE:
          serviceImpl.getVehicule((ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetVehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_VEHICULE:
          serviceImpl.getListVehicule((ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.GetAllVehiculesResponse>) responseObserver);
          break;
        case METHODID_SAVE_VEHICULE:
          serviceImpl.saveVehicule((ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.SaveVehiculeResponse>) responseObserver);
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

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.immatriculation_service.web.grpc.stub.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getGetProprietaireMethod())
              .addMethod(getGetListProprietaireMethod())
              .addMethod(getSaveProprietaireMethod())
              .addMethod(getGetVehiculeMethod())
              .addMethod(getGetListVehiculeMethod())
              .addMethod(getSaveVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
