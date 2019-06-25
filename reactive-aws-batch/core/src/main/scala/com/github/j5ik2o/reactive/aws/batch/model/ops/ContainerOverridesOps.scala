// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerOverridesBuilderOps(val self: ContainerOverrides.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vcpusAsScala(value: Option[Int]): ContainerOverrides.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[Int]): ContainerOverrides.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala(value: Option[Seq[String]]): ContainerOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.command(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): ContainerOverrides.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environment(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala(value: Option[Seq[ResourceRequirement]]): ContainerOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceRequirements(v.asJava)
    }
  }

}

final class ContainerOverridesOps(val self: ContainerOverrides) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vcpusAsScala: Option[Int] = Option(self.vcpus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[Int] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala: Option[Seq[ResourceRequirement]] = Option(self.resourceRequirements).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerOverridesOps {

  implicit def toContainerOverridesBuilderOps(v: ContainerOverrides.Builder): ContainerOverridesBuilderOps =
    new ContainerOverridesBuilderOps(v)

  implicit def toContainerOverridesOps(v: ContainerOverrides): ContainerOverridesOps = new ContainerOverridesOps(v)

}
