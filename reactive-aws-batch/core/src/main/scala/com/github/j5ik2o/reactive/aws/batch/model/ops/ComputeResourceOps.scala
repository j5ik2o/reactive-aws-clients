// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeResourceBuilderOps(val self: ComputeResource.Builder) extends AnyVal {

  final def typeAsScala(value: Option[CRType]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

  final def minvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.minvCpus(v)
    }
  } // Int

  final def maxvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.maxvCpus(v)
    }
  } // Int

  final def desiredvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.desiredvCpus(v)
    }
  } // Int

  final def instanceTypesAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceTypes(v.asJava)
    } // Seq[String]
  }

  final def imageIdAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  } // String

  final def subnetsAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnets(v.asJava)
    } // Seq[String]
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    } // Seq[String]
  }

  final def ec2KeyPairAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.ec2KeyPair(v)
    }
  } // String

  final def instanceRoleAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.instanceRole(v)
    }
  } // String

  final def tagsAsScala(value: Option[Map[String, String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

  final def placementGroupAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.placementGroup(v)
    }
  } // String

  final def bidPercentageAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.bidPercentage(v)
    }
  } // Int

  final def spotIamFleetRoleAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.spotIamFleetRole(v)
    }
  } // String

  final def launchTemplateAsScala(value: Option[LaunchTemplateSpecification]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  } // LaunchTemplateSpecification

}

final class ComputeResourceOps(val self: ComputeResource) extends AnyVal {

  final def typeAsScala: Option[CRType] = Option(self.`type`) // String

  final def minvCpusAsScala: Option[Int] = Option(self.minvCpus) // Int

  final def maxvCpusAsScala: Option[Int] = Option(self.maxvCpus) // Int

  final def desiredvCpusAsScala: Option[Int] = Option(self.desiredvCpus) // Int

  final def instanceTypesAsScala: Option[Seq[String]] = Option(self.instanceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def imageIdAsScala: Option[String] = Option(self.imageId) // String

  final def subnetsAsScala: Option[Seq[String]] = Option(self.subnets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def ec2KeyPairAsScala: Option[String] = Option(self.ec2KeyPair) // String

  final def instanceRoleAsScala: Option[String] = Option(self.instanceRole) // String

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def placementGroupAsScala: Option[String] = Option(self.placementGroup) // String

  final def bidPercentageAsScala: Option[Int] = Option(self.bidPercentage) // Int

  final def spotIamFleetRoleAsScala: Option[String] = Option(self.spotIamFleetRole) // String

  final def launchTemplateAsScala: Option[LaunchTemplateSpecification] =
    Option(self.launchTemplate) // LaunchTemplateSpecification

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeResourceOps {

  implicit def toComputeResourceBuilderOps(v: ComputeResource.Builder): ComputeResourceBuilderOps =
    new ComputeResourceBuilderOps(v)

  implicit def toComputeResourceOps(v: ComputeResource): ComputeResourceOps = new ComputeResourceOps(v)

}
