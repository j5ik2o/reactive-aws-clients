// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResponseErrorBuilderOps(val self: ResponseError.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[LaunchTemplateErrorCode]): ResponseError.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): ResponseError.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class ResponseErrorOps(val self: ResponseError) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[LaunchTemplateErrorCode] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResponseErrorOps {

implicit def toResponseErrorBuilderOps(v: ResponseError.Builder): ResponseErrorBuilderOps = new ResponseErrorBuilderOps(v)

implicit def toResponseErrorOps(v: ResponseError): ResponseErrorOps = new ResponseErrorOps(v)

}

