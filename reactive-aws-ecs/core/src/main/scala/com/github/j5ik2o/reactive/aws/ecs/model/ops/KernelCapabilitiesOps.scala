// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class KernelCapabilitiesBuilderOps(val self: KernelCapabilities.Builder) extends AnyVal {

  final def addAsScala(value: Option[Seq[String]]): KernelCapabilities.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.add(v.asJava)
    }
  }

  final def dropAsScala(value: Option[Seq[String]]): KernelCapabilities.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.drop(v.asJava)
    }
  }

}

final class KernelCapabilitiesOps(val self: KernelCapabilities) extends AnyVal {

  final def addAsScala: Option[Seq[String]] = Option(self.add).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def dropAsScala: Option[Seq[String]] = Option(self.drop).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKernelCapabilitiesOps {

  implicit def toKernelCapabilitiesBuilderOps(v: KernelCapabilities.Builder): KernelCapabilitiesBuilderOps =
    new KernelCapabilitiesBuilderOps(v)

  implicit def toKernelCapabilitiesOps(v: KernelCapabilities): KernelCapabilitiesOps = new KernelCapabilitiesOps(v)

}
