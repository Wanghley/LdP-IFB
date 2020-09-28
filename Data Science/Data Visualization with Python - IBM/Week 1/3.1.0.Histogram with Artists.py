from matplotlib.backends.backend_agg import FigureCanvasAgg as FigureCanvas ##import FigureCanvas
from matplotlib.figure import Figure #import Figure artist
fig = Figure()
canvas = FigureCanvas(fig)

## Generate 10000 random numbers using numpy
import numpy as np
x = np.random.randn(10000)

ax = fig.add_subplot(111) #Create an axes artist
## 111 MATPLOT Convension 1 row, 1 column, initiating at 1

ax.hist(x,100) # generate a histogram of the 10000 numbers

## add title to the figure and save it
ax.set_title('Normal distribution with \u03BC=0, \u03C3=1')
fig.savefig('3.1.1.maplotlib_histogram.png')