// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeResourceBuilderOps(val self: ComputeResource.Builder) extends AnyVal {

  final def typeAsScala(value: Option[CRType]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def minvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.minvCpus(v)
    }
  }

  final def maxvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.maxvCpus(v)
    }
  }

  final def desiredvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.desiredvCpus(v)
    }
  }

  final def instanceTypesAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceTypes(v.asJava)
    }
  }

  final def imageIdAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def subnetsAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnets(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def ec2KeyPairAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.ec2KeyPair(v)
    }
  }

  final def instanceRoleAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.instanceRole(v)
    }
  }

  final def tagsAsScala(value: Option[Map[String, String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def placementGroupAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.placementGroup(v)
    }
  }

  final def bidPercentageAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.bidPercentage(v)
    }
  }

  final def spotIamFleetRoleAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.spotIamFleetRole(v)
    }
  }

  final def launchTemplateAsScala(value: Option[LaunchTemplateSpecification]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

}

final class ComputeResourceOps(val self: ComputeResource) extends AnyVal {

  final def typeAsScala: Option[CRType] = Option(self.`type`)

  final def minvCpusAsScala: Option[Int] = Option(self.minvCpus)

  final def maxvCpusAsScala: Option[Int] = Option(self.maxvCpus)

  final def desiredvCpusAsScala: Option[Int] = Option(self.desiredvCpus)

  final def instanceTypesAsScala: Option[Seq[String]] = Option(self.instanceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def subnetsAsScala: Option[Seq[String]] = Option(self.subnets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ec2KeyPairAsScala: Option[String] = Option(self.ec2KeyPair)

  final def instanceRoleAsScala: Option[String] = Option(self.instanceRole)

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def placementGroupAsScala: Option[String] = Option(self.placementGroup)

  final def bidPercentageAsScala: Option[Int] = Option(self.bidPercentage)

  final def spotIamFleetRoleAsScala: Option[String] = Option(self.spotIamFleetRole)

  final def launchTemplateAsScala: Option[LaunchTemplateSpecification] = Option(self.launchTemplate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeResourceOps {

  implicit def toComputeResourceBuilderOps(v: ComputeResource.Builder): ComputeResourceBuilderOps =
    new ComputeResourceBuilderOps(v)

  implicit def toComputeResourceOps(v: ComputeResource): ComputeResourceOps = new ComputeResourceOps(v)

}
