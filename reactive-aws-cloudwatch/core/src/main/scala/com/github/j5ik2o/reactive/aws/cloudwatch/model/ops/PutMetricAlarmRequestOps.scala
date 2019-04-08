// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutMetricAlarmRequestBuilderOps(val self: PutMetricAlarmRequest.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  final def alarmDescriptionAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.alarmDescription(v)
    }
  }

  final def actionsEnabledAsScala(value: Option[Boolean]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.actionsEnabled(v)
    }
  }

  final def okActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.okActions(v.asJava)
    }
  }

  final def alarmActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.alarmActions(v.asJava)
    }
  }

  final def insufficientDataActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.insufficientDataActions(v.asJava)
    }
  }

  final def metricNameAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  final def namespaceAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  final def statisticAsScala(value: Option[Statistic]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.statistic(v)
    }
  }

  final def extendedStatisticAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.extendedStatistic(v)
    }
  }

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    }
  }

  final def periodAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  }

  final def unitAsScala(value: Option[StandardUnit]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  }

  final def evaluationPeriodsAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.evaluationPeriods(v)
    }
  }

  final def datapointsToAlarmAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.datapointsToAlarm(v)
    }
  }

  final def thresholdAsScala(value: Option[Double]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.threshold(v)
    }
  }

  final def comparisonOperatorAsScala(value: Option[ComparisonOperator]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.comparisonOperator(v)
    }
  }

  final def treatMissingDataAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.treatMissingData(v)
    }
  }

  final def evaluateLowSampleCountPercentileAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.evaluateLowSampleCountPercentile(v)
    }
  }

  final def metricsAsScala(value: Option[Seq[MetricDataQuery]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metrics(v.asJava)
    }
  }

}

final class PutMetricAlarmRequestOps(val self: PutMetricAlarmRequest) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  final def alarmDescriptionAsScala: Option[String] = Option(self.alarmDescription)

  final def actionsEnabledAsScala: Option[Boolean] = Option(self.actionsEnabled)

  final def okActionsAsScala: Option[Seq[String]] = Option(self.okActions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def alarmActionsAsScala: Option[Seq[String]] = Option(self.alarmActions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def insufficientDataActionsAsScala: Option[Seq[String]] = Option(self.insufficientDataActions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def metricNameAsScala: Option[String] = Option(self.metricName)

  final def namespaceAsScala: Option[String] = Option(self.namespace)

  final def statisticAsScala: Option[Statistic] = Option(self.statistic)

  final def extendedStatisticAsScala: Option[String] = Option(self.extendedStatistic)

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def periodAsScala: Option[Int] = Option(self.period)

  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

  final def evaluationPeriodsAsScala: Option[Int] = Option(self.evaluationPeriods)

  final def datapointsToAlarmAsScala: Option[Int] = Option(self.datapointsToAlarm)

  final def thresholdAsScala: Option[Double] = Option(self.threshold)

  final def comparisonOperatorAsScala: Option[ComparisonOperator] = Option(self.comparisonOperator)

  final def treatMissingDataAsScala: Option[String] = Option(self.treatMissingData)

  final def evaluateLowSampleCountPercentileAsScala: Option[String] = Option(self.evaluateLowSampleCountPercentile)

  final def metricsAsScala: Option[Seq[MetricDataQuery]] = Option(self.metrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricAlarmRequestOps {

  implicit def toPutMetricAlarmRequestBuilderOps(v: PutMetricAlarmRequest.Builder): PutMetricAlarmRequestBuilderOps =
    new PutMetricAlarmRequestBuilderOps(v)

  implicit def toPutMetricAlarmRequestOps(v: PutMetricAlarmRequest): PutMetricAlarmRequestOps =
    new PutMetricAlarmRequestOps(v)

}
