// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerOverrideBuilderOps(val self: ContainerOverride.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ContainerOverride.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala(value: Option[Seq[String]]): ContainerOverride.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.command(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerOverride.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environment(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[Int]): ContainerOverride.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[Int]): ContainerOverride.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryReservationAsScala(value: Option[Int]): ContainerOverride.Builder = {
    value.fold(self) { v =>
      self.memoryReservation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala(value: Option[Seq[ResourceRequirement]]): ContainerOverride.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceRequirements(v.asJava)
    }
  }

}

final class ContainerOverrideOps(val self: ContainerOverride) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[Int] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[Int] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryReservationAsScala: Option[Int] = Option(self.memoryReservation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala: Option[Seq[ResourceRequirement]] = Option(self.resourceRequirements).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerOverrideOps {

  implicit def toContainerOverrideBuilderOps(v: ContainerOverride.Builder): ContainerOverrideBuilderOps =
    new ContainerOverrideBuilderOps(v)

  implicit def toContainerOverrideOps(v: ContainerOverride): ContainerOverrideOps = new ContainerOverrideOps(v)

}
