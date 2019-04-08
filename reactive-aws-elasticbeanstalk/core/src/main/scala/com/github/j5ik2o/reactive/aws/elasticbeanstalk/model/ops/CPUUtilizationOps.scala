// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CPUUtilizationBuilderOps(val self: CPUUtilization.Builder) extends AnyVal {

  final def userAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  }

  final def niceAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.nice(v)
    }
  }

  final def systemAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.system(v)
    }
  }

  final def idleAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.idle(v)
    }
  }

  final def ioWaitAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.ioWait(v)
    }
  }

  final def irqAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.irq(v)
    }
  }

  final def softIRQAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.softIRQ(v)
    }
  }

  final def privilegedAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  }

}

final class CPUUtilizationOps(val self: CPUUtilization) extends AnyVal {

  final def userAsScala: Option[Double] = Option(self.user)

  final def niceAsScala: Option[Double] = Option(self.nice)

  final def systemAsScala: Option[Double] = Option(self.system)

  final def idleAsScala: Option[Double] = Option(self.idle)

  final def ioWaitAsScala: Option[Double] = Option(self.ioWait)

  final def irqAsScala: Option[Double] = Option(self.irq)

  final def softIRQAsScala: Option[Double] = Option(self.softIRQ)

  final def privilegedAsScala: Option[Double] = Option(self.privileged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCPUUtilizationOps {

  implicit def toCPUUtilizationBuilderOps(v: CPUUtilization.Builder): CPUUtilizationBuilderOps =
    new CPUUtilizationBuilderOps(v)

  implicit def toCPUUtilizationOps(v: CPUUtilization): CPUUtilizationOps = new CPUUtilizationOps(v)

}
