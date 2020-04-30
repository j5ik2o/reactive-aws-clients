// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFleetErrorBuilderOps(val self: DeleteFleetError.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[DeleteFleetErrorCode]): DeleteFleetError.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): DeleteFleetError.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class DeleteFleetErrorOps(val self: DeleteFleetError) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[DeleteFleetErrorCode] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFleetErrorOps {

implicit def toDeleteFleetErrorBuilderOps(v: DeleteFleetError.Builder): DeleteFleetErrorBuilderOps = new DeleteFleetErrorBuilderOps(v)

implicit def toDeleteFleetErrorOps(v: DeleteFleetError): DeleteFleetErrorOps = new DeleteFleetErrorOps(v)

}

