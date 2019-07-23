// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CPUUtilizationBuilderOps(val self: CPUUtilization.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def niceAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.nice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def systemAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.system(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idleAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.idle(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ioWaitAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.ioWait(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def irqAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.irq(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def softIRQAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.softIRQ(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  }

}

final class CPUUtilizationOps(val self: CPUUtilization) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala: Option[Double] = Option(self.user)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def niceAsScala: Option[Double] = Option(self.nice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def systemAsScala: Option[Double] = Option(self.system)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idleAsScala: Option[Double] = Option(self.idle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ioWaitAsScala: Option[Double] = Option(self.ioWait)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def irqAsScala: Option[Double] = Option(self.irq)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def softIRQAsScala: Option[Double] = Option(self.softIRQ)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala: Option[Double] = Option(self.privileged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCPUUtilizationOps {

  implicit def toCPUUtilizationBuilderOps(v: CPUUtilization.Builder): CPUUtilizationBuilderOps =
    new CPUUtilizationBuilderOps(v)

  implicit def toCPUUtilizationOps(v: CPUUtilization): CPUUtilizationOps = new CPUUtilizationOps(v)

}
