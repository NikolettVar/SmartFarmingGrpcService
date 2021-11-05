// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appleproduction.proto

package grpc.smartfarming;

/**
 * Protobuf type {@code WeeklyApplePrice}
 */
public  final class WeeklyApplePrice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WeeklyApplePrice)
    WeeklyApplePriceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeeklyApplePrice.newBuilder() to construct.
  private WeeklyApplePrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeeklyApplePrice() {
    weeklyApplePrice_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeeklyApplePrice(
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
          case 9: {

            weeklyApplePrice_ = input.readDouble();
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
    return grpc.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyApplePrice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyApplePrice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartfarming.WeeklyApplePrice.class, grpc.smartfarming.WeeklyApplePrice.Builder.class);
  }

  public static final int WEEKLYAPPLEPRICE_FIELD_NUMBER = 1;
  private double weeklyApplePrice_;
  /**
   * <code>double weeklyApplePrice = 1;</code>
   */
  public double getWeeklyApplePrice() {
    return weeklyApplePrice_;
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
    if (weeklyApplePrice_ != 0D) {
      output.writeDouble(1, weeklyApplePrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weeklyApplePrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, weeklyApplePrice_);
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
    if (!(obj instanceof grpc.smartfarming.WeeklyApplePrice)) {
      return super.equals(obj);
    }
    grpc.smartfarming.WeeklyApplePrice other = (grpc.smartfarming.WeeklyApplePrice) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getWeeklyApplePrice())
        == java.lang.Double.doubleToLongBits(
            other.getWeeklyApplePrice()));
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
    hash = (37 * hash) + WEEKLYAPPLEPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeeklyApplePrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartfarming.WeeklyApplePrice parseFrom(
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
  public static Builder newBuilder(grpc.smartfarming.WeeklyApplePrice prototype) {
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
   * Protobuf type {@code WeeklyApplePrice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WeeklyApplePrice)
      grpc.smartfarming.WeeklyApplePriceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyApplePrice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyApplePrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartfarming.WeeklyApplePrice.class, grpc.smartfarming.WeeklyApplePrice.Builder.class);
    }

    // Construct using grpc.smartfarming.WeeklyApplePrice.newBuilder()
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
      weeklyApplePrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyApplePrice_descriptor;
    }

    @java.lang.Override
    public grpc.smartfarming.WeeklyApplePrice getDefaultInstanceForType() {
      return grpc.smartfarming.WeeklyApplePrice.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartfarming.WeeklyApplePrice build() {
      grpc.smartfarming.WeeklyApplePrice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartfarming.WeeklyApplePrice buildPartial() {
      grpc.smartfarming.WeeklyApplePrice result = new grpc.smartfarming.WeeklyApplePrice(this);
      result.weeklyApplePrice_ = weeklyApplePrice_;
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
      if (other instanceof grpc.smartfarming.WeeklyApplePrice) {
        return mergeFrom((grpc.smartfarming.WeeklyApplePrice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartfarming.WeeklyApplePrice other) {
      if (other == grpc.smartfarming.WeeklyApplePrice.getDefaultInstance()) return this;
      if (other.getWeeklyApplePrice() != 0D) {
        setWeeklyApplePrice(other.getWeeklyApplePrice());
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
      grpc.smartfarming.WeeklyApplePrice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartfarming.WeeklyApplePrice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double weeklyApplePrice_ ;
    /**
     * <code>double weeklyApplePrice = 1;</code>
     */
    public double getWeeklyApplePrice() {
      return weeklyApplePrice_;
    }
    /**
     * <code>double weeklyApplePrice = 1;</code>
     */
    public Builder setWeeklyApplePrice(double value) {
      
      weeklyApplePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weeklyApplePrice = 1;</code>
     */
    public Builder clearWeeklyApplePrice() {
      
      weeklyApplePrice_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:WeeklyApplePrice)
  }

  // @@protoc_insertion_point(class_scope:WeeklyApplePrice)
  private static final grpc.smartfarming.WeeklyApplePrice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartfarming.WeeklyApplePrice();
  }

  public static grpc.smartfarming.WeeklyApplePrice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeeklyApplePrice>
      PARSER = new com.google.protobuf.AbstractParser<WeeklyApplePrice>() {
    @java.lang.Override
    public WeeklyApplePrice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeeklyApplePrice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeeklyApplePrice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeeklyApplePrice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartfarming.WeeklyApplePrice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
