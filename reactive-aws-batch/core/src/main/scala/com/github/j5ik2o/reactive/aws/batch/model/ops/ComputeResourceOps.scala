// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeResourceBuilderOps(val self: ComputeResource.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[CRType]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.minvCpus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.maxvCpus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredvCpusAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.desiredvCpus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypesAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTypes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ec2KeyPairAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.ec2KeyPair(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceRoleAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.instanceRole(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): ComputeResource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementGroupAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.placementGroup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bidPercentageAsScala(value: Option[Int]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.bidPercentage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotIamFleetRoleAsScala(value: Option[String]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.spotIamFleetRole(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala(value: Option[LaunchTemplateSpecification]): ComputeResource.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

}

final class ComputeResourceOps(val self: ComputeResource) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[CRType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minvCpusAsScala: Option[Int] = Option(self.minvCpus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxvCpusAsScala: Option[Int] = Option(self.maxvCpus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredvCpusAsScala: Option[Int] = Option(self.desiredvCpus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypesAsScala: Option[Seq[String]] = Option(self.instanceTypes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala: Option[Seq[String]] = Option(self.subnets).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ec2KeyPairAsScala: Option[String] = Option(self.ec2KeyPair)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceRoleAsScala: Option[String] = Option(self.instanceRole)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementGroupAsScala: Option[String] = Option(self.placementGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bidPercentageAsScala: Option[Int] = Option(self.bidPercentage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotIamFleetRoleAsScala: Option[String] = Option(self.spotIamFleetRole)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala: Option[LaunchTemplateSpecification] = Option(self.launchTemplate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeResourceOps {

  implicit def toComputeResourceBuilderOps(v: ComputeResource.Builder): ComputeResourceBuilderOps =
    new ComputeResourceBuilderOps(v)

  implicit def toComputeResourceOps(v: ComputeResource): ComputeResourceOps = new ComputeResourceOps(v)

}
