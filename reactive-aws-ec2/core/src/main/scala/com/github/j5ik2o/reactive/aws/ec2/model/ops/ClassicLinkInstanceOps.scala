// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClassicLinkInstanceBuilderOps(val self: ClassicLinkInstance.Builder) extends AnyVal {

  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): ClassicLinkInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def instanceIdAsScala(value: Option[String]): ClassicLinkInstance.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ClassicLinkInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): ClassicLinkInstance.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class ClassicLinkInstanceOps(val self: ClassicLinkInstance) extends AnyVal {

  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClassicLinkInstanceOps {

  implicit def toClassicLinkInstanceBuilderOps(v: ClassicLinkInstance.Builder): ClassicLinkInstanceBuilderOps =
    new ClassicLinkInstanceBuilderOps(v)

  implicit def toClassicLinkInstanceOps(v: ClassicLinkInstance): ClassicLinkInstanceOps = new ClassicLinkInstanceOps(v)

}
