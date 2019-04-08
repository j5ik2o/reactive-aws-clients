// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerOverridesBuilderOps(val self: ContainerOverrides.Builder) extends AnyVal {

  final def vcpusAsScala(value: Option[Int]): ContainerOverrides.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  } // Int

  final def memoryAsScala(value: Option[Int]): ContainerOverrides.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  } // Int

  final def commandAsScala(value: Option[Seq[String]]): ContainerOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.command(v.asJava)
    } // Seq[String]
  }

  final def instanceTypeAsScala(value: Option[String]): ContainerOverrides.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  } // String

  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environment(v.asJava)
    } // Seq[KeyValuePair]
  }

}

final class ContainerOverridesOps(val self: ContainerOverrides) extends AnyVal {

  final def vcpusAsScala: Option[Int] = Option(self.vcpus) // Int

  final def memoryAsScala: Option[Int] = Option(self.memory) // Int

  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType) // String

  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeyValuePair]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerOverridesOps {

  implicit def toContainerOverridesBuilderOps(v: ContainerOverrides.Builder): ContainerOverridesBuilderOps =
    new ContainerOverridesBuilderOps(v)

  implicit def toContainerOverridesOps(v: ContainerOverrides): ContainerOverridesOps = new ContainerOverridesOps(v)

}
