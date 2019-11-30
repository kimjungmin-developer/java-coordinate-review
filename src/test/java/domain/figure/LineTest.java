package domain.figure;

import domain.Points;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class LineTest {
    @Test
    @DisplayName("선분의 길이 구하기")
    void calculate_distance() {
        Points points = new Points("(0,0)-(1,0)");
        Figure line = FigureFactory.createFigure(points);
        assertThat(line.calculateDistanceOrArea()).isEqualTo(1);
    }

}