// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class KernelCapabilitiesBuilderOps(val self: KernelCapabilities.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addAsScala(value: Option[Seq[String]]): KernelCapabilities.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.add(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dropAsScala(value: Option[Seq[String]]): KernelCapabilities.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.drop(v.asJava)
    }
  }

}

final class KernelCapabilitiesOps(val self: KernelCapabilities) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addAsScala: Option[Seq[String]] = Option(self.add).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dropAsScala: Option[Seq[String]] = Option(self.drop).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKernelCapabilitiesOps {

  implicit def toKernelCapabilitiesBuilderOps(v: KernelCapabilities.Builder): KernelCapabilitiesBuilderOps =
    new KernelCapabilitiesBuilderOps(v)

  implicit def toKernelCapabilitiesOps(v: KernelCapabilities): KernelCapabilitiesOps = new KernelCapabilitiesOps(v)

}
