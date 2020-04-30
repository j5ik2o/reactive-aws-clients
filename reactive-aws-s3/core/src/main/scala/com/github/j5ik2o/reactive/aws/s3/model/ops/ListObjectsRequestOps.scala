// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsRequestBuilderOps(val self: ListObjectsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def delimiterAsScala(value: Option[String]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.delimiter(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.encodingType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def markerAsScala(value: Option[String]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.marker(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxKeysAsScala(value: Option[Int]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.maxKeys(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala(value: Option[String]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.prefix(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala(value: Option[RequestPayer]): ListObjectsRequest.Builder = {
            value.fold(self){ v => self.requestPayer(v) }
            } 


}

final class ListObjectsRequestOps(val self: ListObjectsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def delimiterAsScala: Option[String] = Option(self.delimiter) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def markerAsScala: Option[String] = Option(self.marker) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxKeysAsScala: Option[Int] = Option(self.maxKeys) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala: Option[String] = Option(self.prefix) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsRequestOps {

implicit def toListObjectsRequestBuilderOps(v: ListObjectsRequest.Builder): ListObjectsRequestBuilderOps = new ListObjectsRequestBuilderOps(v)

implicit def toListObjectsRequestOps(v: ListObjectsRequest): ListObjectsRequestOps = new ListObjectsRequestOps(v)

}

