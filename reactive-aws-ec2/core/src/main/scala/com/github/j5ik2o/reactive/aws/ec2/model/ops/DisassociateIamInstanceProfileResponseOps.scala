// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateIamInstanceProfileResponseBuilderOps(val self: DisassociateIamInstanceProfileResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAssociationAsScala(value: Option[IamInstanceProfileAssociation]): DisassociateIamInstanceProfileResponse.Builder = {
            value.fold(self){ v => self.iamInstanceProfileAssociation(v) }
            } 


}

final class DisassociateIamInstanceProfileResponseOps(val self: DisassociateIamInstanceProfileResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAssociationAsScala: Option[IamInstanceProfileAssociation] = Option(self.iamInstanceProfileAssociation) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateIamInstanceProfileResponseOps {

implicit def toDisassociateIamInstanceProfileResponseBuilderOps(v: DisassociateIamInstanceProfileResponse.Builder): DisassociateIamInstanceProfileResponseBuilderOps = new DisassociateIamInstanceProfileResponseBuilderOps(v)

implicit def toDisassociateIamInstanceProfileResponseOps(v: DisassociateIamInstanceProfileResponse): DisassociateIamInstanceProfileResponseOps = new DisassociateIamInstanceProfileResponseOps(v)

}

