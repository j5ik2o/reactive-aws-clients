// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociationStatusBuilderOps(val self: AssociationStatus.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[AssociationStatusCode]): AssociationStatus.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): AssociationStatus.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class AssociationStatusOps(val self: AssociationStatus) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[AssociationStatusCode] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociationStatusOps {

implicit def toAssociationStatusBuilderOps(v: AssociationStatus.Builder): AssociationStatusBuilderOps = new AssociationStatusBuilderOps(v)

implicit def toAssociationStatusOps(v: AssociationStatus): AssociationStatusOps = new AssociationStatusOps(v)

}

