// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class HealthCheckBuilderOps(val self: HealthCheck.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala(value: Option[Seq[String]]): HealthCheck.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.command(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def intervalAsScala(value: Option[Int]): HealthCheck.Builder = {
    value.fold(self) { v =>
      self.interval(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[Int]): HealthCheck.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retriesAsScala(value: Option[Int]): HealthCheck.Builder = {
    value.fold(self) { v =>
      self.retries(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startPeriodAsScala(value: Option[Int]): HealthCheck.Builder = {
    value.fold(self) { v =>
      self.startPeriod(v)
    }
  }

}

final class HealthCheckOps(val self: HealthCheck) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def intervalAsScala: Option[Int] = Option(self.interval)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retriesAsScala: Option[Int] = Option(self.retries)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startPeriodAsScala: Option[Int] = Option(self.startPeriod)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHealthCheckOps {

  implicit def toHealthCheckBuilderOps(v: HealthCheck.Builder): HealthCheckBuilderOps = new HealthCheckBuilderOps(v)

  implicit def toHealthCheckOps(v: HealthCheck): HealthCheckOps = new HealthCheckOps(v)

}
