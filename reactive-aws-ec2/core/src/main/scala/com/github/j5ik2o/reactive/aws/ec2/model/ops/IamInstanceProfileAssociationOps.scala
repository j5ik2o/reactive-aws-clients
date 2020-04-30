// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IamInstanceProfileAssociationBuilderOps(val self: IamInstanceProfileAssociation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala(value: Option[String]): IamInstanceProfileAssociation.Builder = {
            value.fold(self){ v => self.associationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): IamInstanceProfileAssociation.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAsScala(value: Option[IamInstanceProfile]): IamInstanceProfileAssociation.Builder = {
            value.fold(self){ v => self.iamInstanceProfile(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[IamInstanceProfileAssociationState]): IamInstanceProfileAssociation.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala(value: Option[java.time.Instant]): IamInstanceProfileAssociation.Builder = {
            value.fold(self){ v => self.timestamp(v) }
            } 


}

final class IamInstanceProfileAssociationOps(val self: IamInstanceProfileAssociation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala: Option[String] = Option(self.associationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAsScala: Option[IamInstanceProfile] = Option(self.iamInstanceProfile) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[IamInstanceProfileAssociationState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIamInstanceProfileAssociationOps {

implicit def toIamInstanceProfileAssociationBuilderOps(v: IamInstanceProfileAssociation.Builder): IamInstanceProfileAssociationBuilderOps = new IamInstanceProfileAssociationBuilderOps(v)

implicit def toIamInstanceProfileAssociationOps(v: IamInstanceProfileAssociation): IamInstanceProfileAssociationOps = new IamInstanceProfileAssociationOps(v)

}

