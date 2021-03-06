// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appleproduction.proto

package grpc.apple.smartfarming;

/**
 * <pre>
 *request message contains a string
 * </pre>
 *
 * Protobuf type {@code ApplePrice}
 */
public  final class ApplePrice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApplePrice)
    ApplePriceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplePrice.newBuilder() to construct.
  private ApplePrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplePrice() {
    appleSalesPrice_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplePrice(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            appleSalesPrice_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_ApplePrice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_ApplePrice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.apple.smartfarming.ApplePrice.class, grpc.apple.smartfarming.ApplePrice.Builder.class);
  }

  public static final int APPLESALESPRICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object appleSalesPrice_;
  /**
   * <code>string appleSalesPrice = 1;</code>
   */
  public java.lang.String getAppleSalesPrice() {
    java.lang.Object ref = appleSalesPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appleSalesPrice_ = s;
      return s;
    }
  }
  /**
   * <code>string appleSalesPrice = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAppleSalesPriceBytes() {
    java.lang.Object ref = appleSalesPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appleSalesPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAppleSalesPriceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appleSalesPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAppleSalesPriceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appleSalesPrice_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.apple.smartfarming.ApplePrice)) {
      return super.equals(obj);
    }
    grpc.apple.smartfarming.ApplePrice other = (grpc.apple.smartfarming.ApplePrice) obj;

    boolean result = true;
    result = result && getAppleSalesPrice()
        .equals(other.getAppleSalesPrice());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APPLESALESPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getAppleSalesPrice().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.apple.smartfarming.ApplePrice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.apple.smartfarming.ApplePrice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.apple.smartfarming.ApplePrice parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.apple.smartfarming.ApplePrice prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *request message contains a string
   * </pre>
   *
   * Protobuf type {@code ApplePrice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApplePrice)
      grpc.apple.smartfarming.ApplePriceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_ApplePrice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_ApplePrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.apple.smartfarming.ApplePrice.class, grpc.apple.smartfarming.ApplePrice.Builder.class);
    }

    // Construct using grpc.apple.smartfarming.ApplePrice.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      appleSalesPrice_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_ApplePrice_descriptor;
    }

    @java.lang.Override
    public grpc.apple.smartfarming.ApplePrice getDefaultInstanceForType() {
      return grpc.apple.smartfarming.ApplePrice.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.apple.smartfarming.ApplePrice build() {
      grpc.apple.smartfarming.ApplePrice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.apple.smartfarming.ApplePrice buildPartial() {
      grpc.apple.smartfarming.ApplePrice result = new grpc.apple.smartfarming.ApplePrice(this);
      result.appleSalesPrice_ = appleSalesPrice_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.apple.smartfarming.ApplePrice) {
        return mergeFrom((grpc.apple.smartfarming.ApplePrice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.apple.smartfarming.ApplePrice other) {
      if (other == grpc.apple.smartfarming.ApplePrice.getDefaultInstance()) return this;
      if (!other.getAppleSalesPrice().isEmpty()) {
        appleSalesPrice_ = other.appleSalesPrice_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.apple.smartfarming.ApplePrice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.apple.smartfarming.ApplePrice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appleSalesPrice_ = "";
    /**
     * <code>string appleSalesPrice = 1;</code>
     */
    public java.lang.String getAppleSalesPrice() {
      java.lang.Object ref = appleSalesPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appleSalesPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string appleSalesPrice = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppleSalesPriceBytes() {
      java.lang.Object ref = appleSalesPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appleSalesPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string appleSalesPrice = 1;</code>
     */
    public Builder setAppleSalesPrice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appleSalesPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string appleSalesPrice = 1;</code>
     */
    public Builder clearAppleSalesPrice() {
      
      appleSalesPrice_ = getDefaultInstance().getAppleSalesPrice();
      onChanged();
      return this;
    }
    /**
     * <code>string appleSalesPrice = 1;</code>
     */
    public Builder setAppleSalesPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appleSalesPrice_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ApplePrice)
  }

  // @@protoc_insertion_point(class_scope:ApplePrice)
  private static final grpc.apple.smartfarming.ApplePrice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.apple.smartfarming.ApplePrice();
  }

  public static grpc.apple.smartfarming.ApplePrice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplePrice>
      PARSER = new com.google.protobuf.AbstractParser<ApplePrice>() {
    @java.lang.Override
    public ApplePrice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplePrice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplePrice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplePrice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.apple.smartfarming.ApplePrice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

