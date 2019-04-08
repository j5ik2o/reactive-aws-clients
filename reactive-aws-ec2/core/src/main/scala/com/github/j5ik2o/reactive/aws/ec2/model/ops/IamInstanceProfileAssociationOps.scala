// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IamInstanceProfileAssociationBuilderOps(val self: IamInstanceProfileAssociation.Builder) extends AnyVal {

  final def associationIdAsScala(value: Option[String]): IamInstanceProfileAssociation.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): IamInstanceProfileAssociation.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def iamInstanceProfileAsScala(value: Option[IamInstanceProfile]): IamInstanceProfileAssociation.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def stateAsScala(value: Option[IamInstanceProfileAssociationState]): IamInstanceProfileAssociation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): IamInstanceProfileAssociation.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class IamInstanceProfileAssociationOps(val self: IamInstanceProfileAssociation) extends AnyVal {

  final def associationIdAsScala: Option[String] = Option(self.associationId)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def iamInstanceProfileAsScala: Option[IamInstanceProfile] = Option(self.iamInstanceProfile)

  final def stateAsScala: Option[IamInstanceProfileAssociationState] = Option(self.state)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIamInstanceProfileAssociationOps {

  implicit def toIamInstanceProfileAssociationBuilderOps(
      v: IamInstanceProfileAssociation.Builder
  ): IamInstanceProfileAssociationBuilderOps = new IamInstanceProfileAssociationBuilderOps(v)

  implicit def toIamInstanceProfileAssociationOps(v: IamInstanceProfileAssociation): IamInstanceProfileAssociationOps =
    new IamInstanceProfileAssociationOps(v)

}
