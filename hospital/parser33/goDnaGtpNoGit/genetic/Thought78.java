package genetic;
import java.util.ArrayList;
class Thought78 extends Thought{
private static ArrayList<Thought78> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 869.2737129040729;
private double fd1 = 798.4411004230332;
private Thought fo0 = null;
private Thought fo1 = null;
Thought78 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought78 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought78 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought78 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought78 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 285.903974024308;
    double ld2 = 488.4424426265989;
    double ld3 = 524.5052792764465;
    lb0 = ld2 > ld3;
    fd0 *= -1;
    fb0 = !fb1;
    double ld4 = 726.6187935259862;
    lb0 = !fb0;
    Output.points[4][2] += fd0;
    fb1 = !lb0;
    fb0 = fd1 > ld1;
    double ld5 = 795.8323882108422;
    ld2 = ld3 - ld4;
    ld5 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ld1, ld2, ld3, ld4);
}
    fb1 = ld5 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = !lb1;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    Thought lo2 = Thought374.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    double ld3 = 464.4556810517184;
    Output.points[4][3] += fd0;
    Thought lo4 = Thought155.getInstance(fd1, ld3, fd0, fd1, fb1, lb0, lb1, ab1);
    ld3 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ld3, fd0, fd1, ld3);
}
    fd0 = fd1 + ld3;
    Thought lo5 = Thought123.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
    fd1 *= -1;
    Thought lo6 = Thought89.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
    double ld7 = 535.3601483094203;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld7, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld3, ld7, fd0, fd1, lb1, ab1, ab2, ab3);
}
    double ld8 = 460.4153165015305;
    ab4 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad3 > ad4;
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    Thought lo1 = Thought231.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought245.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Output.points[4][4] -= fd0;
    Output.points[4][5] += fd1;
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought173.getInstance(lb0, fb0, fb1, lb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought0.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 143.88414383436958;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
    Output.points[4][6] -= ad4;
    lb2 = !fb0;
    fb1 = fd0 < fd1;
    Thought lo3 = Thought170.getInstance(ld0, ad1, ad2, ad3);
    lb1 = lb2 || fb0;
    fb1 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
    lb1 = fd0 < fd1;
    lb2 = fb0 || fb1;
    lb1 = ld0 > ad1;
    Thought lo4 = Thought111.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
    fd1 = ld0 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb1);
}
    lb2 = fd1 < ld0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = fd1 < fd0;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 > fd1;
    Thought lo0 = Thought232.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought27.getInstance();
    Thought lo2 = Thought376.getInstance(fb0, fb1, ab1, ab2);
    Output.points[4][7] -= fd0;
    ab3 = !ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ab3 = ao1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = ab1 && ab2;
    fd0 *= -1;
    ab3 = fd1 < fd0;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    Output.points[4][8] -= fd0;
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb0 = true;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        double ld1 = 355.28974955560915;
        Output.points[5][0] -= fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb2 = false;
        lb2 = fd1 > ld1;
        ab1 = !ab2;
        } else {
if(ao3 != null){
          fb0 = ao3.m2(fb1, ab1, ab2, ab3);
}
        double ld3 = 947.3916937559984;
        ab4 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ao4.m2(fd0, fd1, ld3, ad1, ab4, fb0, fb1, ab1);
}
        ad2 = ad3 - ad4;
        Output.points[5][1] -= fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        fd1 = ld3 + ad1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    if (fb1) {
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        double ld1 = 205.9991959366288;
        Output.points[5][2] += fd0;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          ld1 = fo1.m3();
}
        for(int i0=0; i0<10; i0++){
            Output.points[5][3] -= fd0;
            Thought lo2 = Thought247.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
            fb1 = lb0 && fb0;
if(fo0 != null){
              ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
            fb0 = !fb1;
            fd1 = ld1 - fd0;
}}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][4] -= fd0;
    Thought lo0 = Thought111.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    Output.points[5][5] += fd0;
    double ld2 = 197.24135335017925;
        fd0 = fd1 - ld2;
    ab1 = fd0 < fd1;
    ld2 *= -1;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fd0 *= -1;
    boolean lb4 = false;
    fd1 *= -1;
    lb4 = !ab1;
    ab2 = ab3 || ab4;
    ld2 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[5][6] += ld2;
        fb0 = fb1 && lb1;
        Thought lo5 = Thought94.getInstance();
}
Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 109.87407182246898;
    ld0 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !fb0;
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 && lb1;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    lb0 = fd1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld1 = 701.1209379451931;
    fb0 = ld1 > ad1;
    Thought lo2 = Thought47.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 = ld1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 = ad4 + fd0;
    fb1 = fd1 < ld1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    double ld0 = 430.84782542961017;
    ab2 = fd0 > fd1;
        ab3 = !ab4;
    Thought lo1 = Thought265.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    boolean lb2 = true;
    lb2 = ab1 || ab2;
    ab3 = ab4 && fb0;
    fb1 = fd1 > ld0;
    fd0 = fd1 + ld0;
        lb2 = !ab1;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[5][7] += fd0;
if(ao1 != null){
      ab2 = ao1.m2(fd1, ld0, fd0, fd1);
}
    Thought lo3 = Thought289.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    double ld4 = 271.93724768746387;
    ld4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 398.71748336844576;
if(ao1 != null){
      ab1 = ao1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = fd1 < ld0;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought205.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = false;
    ab4 = fb0 || fb1;
    lb2 = fd0 > fd1;
    ab1 = ld0 < ad1;
    boolean lb3 = true;
    ad2 *= -1;
    ab1 = ad3 < ad4;
    double ld4 = 196.04288540123142;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld4);
}
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = !fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = !lb0;
    fd1 *= -1;
    if (lb1) {
        Output.points[5][8] += fd0;
        fb0 = fd1 < fd0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought75.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld1 = 660.7530596119988;
    Thought lo2 = Thought221.getInstance(ld1, fd0, fd1, ld1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    boolean lb3 = false;
    Output.points[6][0] += fd1;
    boolean lb4 = false;
    Thought lo5 = Thought394.getInstance();
    boolean lb6 = true;
    lb4 = lb6 && ab1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    double ld7 = 854.2969855582926;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought118.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought66.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    if (lb0) {
        fb0 = ad4 < fd0;
        boolean lb3 = true;
        boolean lb4 = true;
        double ld5 = 569.3698221568511;
        lb0 = fb0 || fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ld5, ad1);
}
        lb3 = lb4 && lb0;
        ad2 *= -1;
        fb0 = fb1 || lb3;
        lb4 = ad3 > ad4;
        Output.points[6][1] -= fd0;
        fd1 = ld5 + ad1;
        lb0 = ad2 < ad3;
        boolean lb6 = true;
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld5, ad1);
}
if(fo0 != null){
          fo0.m2();
}
        Thought lo7 = Thought302.getInstance(lb0, fb0, fb1, lb3);
        ad2 *= -1;
        double ld8 = 209.95419378658326;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought216.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo3 = Thought210.getInstance(lb1, lb2, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Output.points[6][2] -= fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought395.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = !lb0;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought385.getInstance();
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought157.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought113.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought379.getInstance();
    Thought lo4 = Thought278.getInstance(fb1, fb0, fb1, fb0);
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    Thought lo5 = Thought88.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 1.6791511025015893;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    ab4 = fb0 || fb1;
    ab1 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3();
}
    Output.points[6][3] += fd0;
    double ld1 = 937.4480960549037;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Output.points[6][4] -= fd0;
    Thought lo2 = Thought362.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought161.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[6][5] += fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
        fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought252.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 698.0508090464325;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    double ld1 = 980.6042572872351;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        if (ab3) {
            ab4 = fb0 && fb1;
            Output.points[6][6] -= fd0;
            Thought lo2 = Thought321.getInstance(fo1, fo0, fo1, fo0);
            ab1 = ab2 || ab3;
if(fo0 != null){
              fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
            ab4 = !fb0;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
}
if(fo0 != null){
              fb1 = fo0.m2();
}
            ab1 = ab2 && ab3;
if(fo1 != null){
              fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
            ld0 = ld1 + fd0;
            fb1 = ab1 && ab2;
            boolean lb3 = true;
            Output.points[6][7] += fd1;
            ld0 *= -1;
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ad2 > ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought106.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought43.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought128.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[6][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 > fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ad1 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought343.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    double ld1 = 664.9214167790166;
    Thought lo2 = Thought128.getInstance();
if(ao1 != null){
      ld1 = ao1.m3(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ld1;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought120.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[7][0] += fd1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    double ld0 = 564.2242218317464;
    fb1 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao3.m1();
}
    double ld1 = 439.7756251384652;
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld2 = 710.1522863286121;
    fb0 = ad3 < ad4;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd0 *= -1;
    Output.points[7][1] -= fd1;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    Thought lo0 = Thought77.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    Output.points[7][2] -= fd1;
    Thought lo1 = Thought183.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    Output.points[7][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    boolean lb2 = true;
    Output.points[7][4] -= fd1;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2();
}
        Output.points[7][5] -= fd0;
        fd1 *= -1;
        ab1 = fd0 > fd1;
        ab2 = ab3 && ab4;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        double ld4 = 719.327322606288;
        ld4 *= -1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought89.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    double ld1 = 215.01074150824525;
if(fo1 != null){
      ld1 = fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought97.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    Thought lo3 = Thought394.getInstance(fo0, fo1, ao1, ao2);
    Thought lo4 = Thought295.getInstance(ld1, ad1, ad2, ad3);
    fb1 = !ab1;
    ad4 = fd0 - fd1;
    Output.points[7][6] -= ld1;
    ad1 *= -1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    Thought lo5 = Thought75.getInstance(ab2, ab3, ab4, fb0);
    Output.points[7][7] += ld1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 971.916429029279;
    Thought lo1 = Thought281.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    Output.points[7][8] += fd1;
    double ld2 = 479.1975595133677;
    Output.points[8][0] -= ld0;
    ld2 = fd0 - fd1;
    fb0 = ld0 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought267.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought240.getInstance(fd0, fd1, ld0, ld2);
    Thought lo5 = Thought288.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    Thought lo6 = Thought363.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo7 = Thought66.getInstance(ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb8 = false;
    ld0 *= -1;
    ld2 = fd0 + fd1;
    ld0 *= -1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb8, fb0);
}
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 101.28941262780998;
    fb0 = fb1 || fb0;
    Output.points[8][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][2] += fd1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought151.getInstance(ld0, fd0, fd1, ld0);
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    lb2 = fb0 || fb1;
    lb2 = !fb0;
    double ld3 = 618.9836065115784;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, fb0, fb1, lb2, fb0);
}
    double ld4 = 437.6348163408707;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld0, fb0, fb1, lb2, lb5);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
