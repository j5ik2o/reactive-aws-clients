// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnsuccessfulItemErrorBuilderOps(val self: UnsuccessfulItemError.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[String]): UnsuccessfulItemError.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): UnsuccessfulItemError.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class UnsuccessfulItemErrorOps(val self: UnsuccessfulItemError) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[String] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnsuccessfulItemErrorOps {

implicit def toUnsuccessfulItemErrorBuilderOps(v: UnsuccessfulItemError.Builder): UnsuccessfulItemErrorBuilderOps = new UnsuccessfulItemErrorBuilderOps(v)

implicit def toUnsuccessfulItemErrorOps(v: UnsuccessfulItemError): UnsuccessfulItemErrorOps = new UnsuccessfulItemErrorOps(v)

}

